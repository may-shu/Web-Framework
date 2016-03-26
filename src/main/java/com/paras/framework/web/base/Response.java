package com.paras.framework.web.base;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Model to represent a outcome of API call.
 * 
 * @author Paras.
 */
public class Response {
	
	protected static String Y = "Y";
	protected static String MESSAGE = "Ok.";
	
	/** 
	 * Flag to represent success or failure of the call.
	 * Y -> Success
	 * N -> Error
	 */
	private String flag;
	
	/**
	 * Any Message regarding outcome of the call.
	 */
	private String message;
	
	/**
	 * Any data that was required in outcome.
	 */
	private Object data;
	
	public Response() {
		
	}
	
	public Response( String flag, String message, Object data ) {
		this.flag = flag;
		this.message = message;
		this.data = data;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	public String toJSON() {

		try{
			ObjectMapper mapper = new ObjectMapper();
			return mapper.writeValueAsString( this );
		}catch( JsonGenerationException ex ) {
			return null;
		}catch( JsonMappingException ex ) {
			return null;
		}catch( IOException ex ) {
			return null;
		}		
	}
}