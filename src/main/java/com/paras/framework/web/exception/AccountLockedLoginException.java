package com.paras.framework.web.exception;

/**
 * Login Exception to represent that a login attempt has been made after account has been locked.
 * @author Paras
 *
 */
public class AccountLockedLoginException extends LoginException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4561797619737266161L;
	
	private static final String ACCOUNT_LOCKED = "Your account has been locked after 3 unsuccessfull login attempts. Please try after some time.";
	
	/**
	 * Create new AccountLockedLoginException.
	 */
	public AccountLockedLoginException() {
		super( ACCOUNT_LOCKED );
	}

}
