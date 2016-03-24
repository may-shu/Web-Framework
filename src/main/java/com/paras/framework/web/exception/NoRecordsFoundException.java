package com.paras.framework.web.exception;

/**
 * Exception to represent that a search yielded no results.
 * 
 * @author Paras.
 */
public class NoRecordsFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8518832038379858740L;

	/**
	 * Create a new NoRecordsFoundException.
	 */
	public NoRecordsFoundException(){ 
		
	}
	
	/**
	 * Create a new NoRecordsFoundException.
	 * @param message Message to be shown to user.
	 */
	public NoRecordsFoundException( String message ) {
		super( message );
	}
}
