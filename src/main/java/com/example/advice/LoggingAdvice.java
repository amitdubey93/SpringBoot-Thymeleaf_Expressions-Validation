package com.example.advice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAdvice {

	Logger logger = LogManager.getLogger(this.getClass());
	@Before("execution(* com.example.controller.EmployeeController.addEmp(..))")
	public void logBefore() {
		logger.info("log msg from logbefore method:: info");
		logger.error("log msg from logbefore method:: error");
		logger.trace("log msg from logbefore method:: trace");
		logger.debug("log msg from logbefore method:: debug");
	}
	/*
	 * @After("execution(* com.example.controller.EmployeeController.addEmp(..))")
	 * public void logAfter() { logger.info("log msg from logafter method");
	 * 
	 * }
	 */

}
