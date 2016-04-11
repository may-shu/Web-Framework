package com.paras.framework.web.exception;

public class InActiveUserLoginException extends LoginException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5682815146011369711L;
	
	private static final String INACTIVE = "Your account is inactive. Please contact system administrator.";
	
	/**
	 * Create new InActiveuserLoginException.
	 */
	public InActiveUserLoginException() {
		super( INACTIVE );
	}	
}
