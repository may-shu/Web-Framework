package com.paras.framework.web.logger;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * A logger that remembers.
 * @author Paras
 *
 */
public class IntelligentLogger extends Logger{
	
	/**
	 * Utility String to be used in creating 'method execution begin' log.
	 */
	private static final String STARTING = " Starting Execution of " ;
	
	/**
	 * Utility String to be used in creating 'method execution end' log.
	 */
	private static final String FINISHED = " Finished Execution of " ;
	
	/**
	 * Utility String to be used in creating 'Caught Exception in ' log.
	 */
	private static final String EXCEPTION = " Caught Exception ";

	/**
	 * String that identifies source file of log.
	 */
	private static final String FQCN = IntelligentLogger.class.getName() + ".";
	
	/**
	 * Factory that creates instance of Intelligent Logger.
	 */
	private static IntelligentLoggerFactory factory = new IntelligentLoggerFactory();
	
	protected IntelligentLogger( String name ) {
		super( name );
	}
	
	public static Logger getLogger( String name ) {
		return Logger.getLogger( name, factory );
	}
	
	/**
	 * Method to log all messages.
	 * @param level Level of the message.
	 * @param message Message String to be logged.
	 */
	private void log( Level level, String message ){
		super.log(FQCN, level, addClassPrefix( message ), null); 
	}
	
	/**
	 * Private method to add Class name before each of the logs, so as to save user effort.
	 * @param message Message which will be prefixed by class name.
	 * @return
	 */
	private String addClassPrefix( String message ) {		
		return "In " + FQCN + " | " + message;		
	}
	
	/**
	 * Private method to add method name before each message, so as to save user effort.
	 * @param method Name of the method.
	 * @param message Message which will be prefixed by method name.
	 * @return
	 */
	private String addMethodInformation( String method, String message ) {
		return "In " + method + " | " + message;
	}
	
	/**
	 * Log a message at info level.
	 * Message will be prefixed by method name, then class name.
	 * 
	 * @param method Name of the method.
	 * @param message Message to be logged.
	 */
	public void info( String method, String message ) {
		log( Level.INFO, addMethodInformation( method, message ));
	}
	
	/**
	 * Log a message at debug level.
	 * Message will be prefixed by method name, then class name.
	 * 
	 * @param method Name of the method.
	 * @param message Message to be logged.
	 */
	public void debug( String method, String message ) {
		log( Level.DEBUG, addMethodInformation( method,  message ));
	}
	
	
	/**
	 * Utility method that prints that a method execution has just started.
	 * @param method Name of the method.
	 */
	public void methodStart( String method ) {
		log( Level.INFO, STARTING + method );
	}
	
	/**
	 * Utility method to log that a method execution has just finished.
	 * @param method Name of the method.
	 */
	public void methodEnd( String method ) {
		log( Level.INFO, FINISHED + method );
	}
	
	/**
	 * Utility method that generates message string from method name and exception object.
	 * @param method Name of method.
	 * @param ex Exception generated.
	 */
	public void error( String method, Exception ex ) {
		log( Level.ERROR, EXCEPTION + ex.getClass().getName() + " in "+ method + " | " + ex.getMessage() );
	}
	
	/**
	 * Utility method that simple logs a message at error level.
	 * @param method
	 * @param message
	 */
	public void error( String method, String message ) {
		log( Level.ERROR, EXCEPTION + method + " | " + message );
	}
}