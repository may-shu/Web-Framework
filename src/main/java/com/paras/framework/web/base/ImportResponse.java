package com.paras.framework.web.base;

public class ImportResponse extends Response {
	
	public ImportResponse( int imported, int retrieved, String entity ) {
		super( Y, imported + "  " + entity + " imported out of " + retrieved + " entities from excel.", null );
	}
}
