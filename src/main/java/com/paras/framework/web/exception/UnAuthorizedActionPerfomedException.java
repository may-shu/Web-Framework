package com.paras.framework.web.exception;

/**
 * Model to represent a situatin in which, user has tried to perform a task, he doesn't has access for.
 * @author Paras.
 *
 */
public class UnAuthorizedActionPerfomedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9084861501095172269L;
	private static String MESSAGE = "You don't have authority to perform this action.";
	
	/**
	 * Create a new UnAuthorizedActionPerformedException.
	 */
	public UnAuthorizedActionPerfomedException() {
		super( MESSAGE );
	}
	
	/**
	 * Create a new UnAuthorizedActionPerfomedException.
	 */
	public UnAuthorizedActionPerfomedException( String message ) {
		super( message );
	}
}