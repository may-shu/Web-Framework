package com.paras.framework.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.security.crypto.codec.Base64;

public class HTML5EnablerFilter implements Filter {
	
	private static Logger LOGGER = Logger.getLogger( HTML5EnablerFilter.class );
	
	public static final String RESOURCES = "/resources";
	
	public static final String PAGES = "/pages";
	public static final String INDEX = "/index.html";
	
	public static final String ROOT = "/";
	public static final String API = "/api";
	
	@Override
	public void init( FilterConfig config ) {
		
	}
	
	@Override
	public void destroy() {}
	
	@Override
	public void doFilter( ServletRequest request, ServletResponse response, FilterChain chain ) throws ServletException, IOException{
		HttpServletRequest httpRequest = ( HttpServletRequest ) request;
        HttpServletResponse httpResponse = ( HttpServletResponse ) response;
        
        String requestedURL = httpRequest.getRequestURI().replace( httpRequest.getContextPath(), "" );
        
        if( requestedURL.equals( ROOT )) {
        	chain.doFilter( request, response); 
        } else if( requestedURL.startsWith( API )) {
        	chain.doFilter( request, response);
        } else if( requestedURL.indexOf( INDEX ) == 0 ) {
        	chain.doFilter( request, response); 
        } else if( requestedURL.indexOf( PAGES ) == 0 ) {
        	chain.doFilter( request, response); 
        } else if( requestedURL.indexOf( RESOURCES ) == 0 ) {
        	chain.doFilter( request, response); 
        } else {
        	String newURL = httpRequest.getContextPath() + "?path=" + new String( Base64.encode( requestedURL.getBytes() ));
        	LOGGER.info( "In HTML5ModeEnableFilter | Found request for deeplinking " + requestedURL + " | Redirected to " + newURL );
        	httpResponse.sendRedirect( newURL );
        }
	}
}
