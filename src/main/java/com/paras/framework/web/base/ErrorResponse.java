package com.paras.framework.web.base;

/**
 * Model to represent that an error has occurred.
 * @author Paras
 *
 */
public class ErrorResponse extends Response {
	
	/**
	 * Create new Response.
	 */
	public ErrorResponse( String message ) {
		super( N, message, null );
	}
	
}
