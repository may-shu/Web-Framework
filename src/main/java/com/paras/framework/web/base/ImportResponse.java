package com.paras.framework.web.base;

public class ImportResponse extends Response {
	
	public ImportResponse( int imported, int retrieved ) {
		super( Y, MESSAGE, imported + " entities imported out of " + retrieved + " entities." );
	}
}
