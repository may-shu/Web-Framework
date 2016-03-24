package com.paras.framework.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

/**
 * Access Logging Filter to log every request onto the console.
 
 * @author Paras.
 */
public class AccessLoggingFilter implements Filter{
    
    private static Logger LOGGER = Logger.getLogger( AccessLoggingFilter.class );
    
    @Override
    public void init( FilterConfig config ) {}
    
    @Override
    public void destroy() {}
    
    @Override
    public void doFilter( ServletRequest request, ServletResponse response, FilterChain chain ) throws ServletException, IOException {
        HttpServletRequest httpRequest = ( HttpServletRequest ) request;
		LOGGER.info( "Request From " + httpRequest.getRemoteAddr() + " Requesting " + httpRequest.getRequestURI() );
		
		chain.doFilter( request, response );
    }
    
}
