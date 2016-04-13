package com.paras.framework.web.exception;

/**
 * Exception to represent a failed login attempt.
 * 
 * @author Paras
 */ 
public class InvalidCredentialsException extends LoginException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3772564463497998507L;
	
	private static String INVALID_CREDENTIALS = "Invalid Credentials. Please try again. !";
	
	public InvalidCredentialsException() {
		super( INVALID_CREDENTIALS );
	}
	
	public InvalidCredentialsException( String message ) {
		super( message );
	}
}
