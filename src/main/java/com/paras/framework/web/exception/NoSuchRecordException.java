package com.paras.framework.web.exception;

public class NoSuchRecordException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6109267701447424381L;
	private static final String MESSAGE = "No such record exists.";
	
	/**
	 * Create a new NoSuchRecordFoundException.
	 */
	public NoSuchRecordException() {
		super( MESSAGE );
	}
	
	/**
	 * Create a new NoSuchRecordFoundException.
	 */
	public NoSuchRecordException( String message ) {
		super( message );
	}
}
