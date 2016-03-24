package com.paras.framework.web.base;

/**
 * Response to represent Successful login response.
 * @author Paras.
 *
 */
public class LoginResponse extends Response {
	/**
	 * Token For the Successful response and subsequent use.
	 */
	private String token;
	
	/**
	 * Create new LoginResponse.
	 */
	public LoginResponse() {
		super( Y, MESSAGE, null );
	}
	
	/**
	 * Create new Login Response
	 * @param user User Information to set.
	 * @param token Token information.
	 */
	public LoginResponse( Object user, String token ) {
		super( Y, MESSAGE, user );
		this.token = token;
	}
	
	public void setToken( String token ) {
		this.token = token;
	}
	
	public String getToken() {
		return token;
	}
}
