package com.paras.framework.web.exception;

/**
 * Exception to represent a failed login attempt.
 * 
 * @author Paras
 */ 
public class InvalidCredentialsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3772564463497998507L;
	
	public InvalidCredentialsException() {
		super();
	}
	
	public InvalidCredentialsException( String message ) {
		super( message );
	}
}
