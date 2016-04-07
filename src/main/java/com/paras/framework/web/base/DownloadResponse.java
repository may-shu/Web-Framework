package com.paras.framework.web.base;

/**
 * Model to represent result of download API call.
 * 
 * @author Gaurav
 *
 */
public class DownloadResponse extends Response {
	private String fileName;
	
	public DownloadResponse() {
		super( Y, MESSAGE, null );
	}
	
	public DownloadResponse( String fileName, String data ) {
		super( Y, MESSAGE, data );
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}
