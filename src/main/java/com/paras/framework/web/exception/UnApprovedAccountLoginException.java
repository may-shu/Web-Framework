package com.paras.framework.web.exception;

public class UnApprovedAccountLoginException extends LoginException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -677214251216773520L;
	
	private static final String UNAPPROVED = "Your account is unapproved.";
	
	public UnApprovedAccountLoginException(){
		super( UNAPPROVED );
	}
}
