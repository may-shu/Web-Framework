package com.paras.framework.web.exception;

/**
 * Action Exception occurs when particular action or operation taken by user has failed.
 * @author Gaurav
 *
 */
public class ActionException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -721733683045202196L;

	/**
	 * Create a new Action Exception.
	 */
	public ActionException(){
		super();
	}
	
	/**
	 * Create a new Action Exception with message.
	 * @param message
	 */
	public ActionException( String message ) {
		super( message );
	}
}
