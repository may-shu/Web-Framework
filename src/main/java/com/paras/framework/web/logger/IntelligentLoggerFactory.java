package com.paras.framework.web.logger;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

/**
 * Logger Factory that returns Intelligent Logger as Logger.
 * @author Paras
 *
 */
class IntelligentLoggerFactory implements LoggerFactory {

	public IntelligentLoggerFactory(){
		
	}
	
	public Logger makeNewLoggerInstance( String name ) {
		return new IntelligentLogger( name );
	}
}
