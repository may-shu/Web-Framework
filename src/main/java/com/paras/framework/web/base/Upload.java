package com.paras.framework.web.base;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.springframework.security.crypto.codec.Base64;

/**
 * Model to represent a upload request.
 * @author Paras
 *
 */
public class Upload {
	private String name;
	private String content;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public InputStream getContentStream() {
		byte[] content = Base64.decode( this.content.getBytes() );
		return new ByteArrayInputStream( content );
	}
}
