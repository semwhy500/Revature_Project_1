package com.revature.ericschmidt.p1.venueapi.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component("loggingAspect")
public class LoggingAspect {

	//The below command creates a new logger
	
	private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
	
	//Defining pointcuts to inject into below
	
	@Pointcut("within(com.revature.ericschmidt.p1.venueapi.service.*)")
	public void logWithinServicePackage() {}
	
	@Pointcut("within(com.revature.ericschmidt.p1.venueapi.repository.*)")
	public void logWithinRepositoryPackage() {}
	
	//Creating the log messages below
	
	@After("logWithinServicePackage()")
	public void logAfterService(JoinPoint jp) {
		logger.info(jp.getSignature().getName() + "() was executed.\n");
	}
	
	@After("logWithinRepositoryPackage()")
	public void logAfterRepository(JoinPoint jp) {
		logger.info(jp.getSignature().getName() + "() was executed.\n");
	}
	
}
