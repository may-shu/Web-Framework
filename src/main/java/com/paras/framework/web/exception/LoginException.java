package com.paras.framework.web.exception;

/**
 * Exception class to represent that an error has occurred in login procedure.
 * @author Paras
 *
 */
public class LoginException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -988888921071502139L;

	/**
	 * Create new LoginException.
	 */
	public LoginException() {
		super();
	}
	
	/**
	 * Create new LoginException with message.
	 */
	public LoginException( String message ) {
		super( message );
	}
}
