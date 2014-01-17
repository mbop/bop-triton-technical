package com.mbop.java.tests.triton.aop;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * This class will be in charge of profiling the {@link MyProfilerExample} class
 * to determine how many times the methods put and get are called on the Map object.
 */

@Aspect
public class MethodExecutionProfiler {
	
	// counter for the number of method calls intercepted
	private AtomicInteger count = new AtomicInteger();
	private Logger logger = Logger.getLogger(MethodExecutionProfiler.class);
	
	/**
	 * This pointcut expression determines that we are interested at the
	 * execution of the put method of a HashMap object
	 */
	@Pointcut("execution(* java.util.HashMap.put(..))")
	public void putCalls() {	}
	
	/**
	 * Poincut for the execution of the get method of a HashMap object
	 */
	@Pointcut("execution(* java.util.HashMap.get(..))")
	public void getCalls() {	}	
	
	/**
	 * Pointcut for the execution of the retrieveItems method of the MyProfilerExample object
	 */
	@Pointcut("execution(* com.mbop.java.tests.triton.aop.MyProfilerExample.retrieveItems(..))")
	public void afterRetrievingData() {	}	
	
	/**
	 * The After advice defines what happens after each put and get method call,
	 * which is increment our counter variable.
	 */
	@After("putCalls() || getCalls()")
	public void doAccessCheck(){
		
		count.incrementAndGet();
	}
	
	/**
	 * Finally after the retrieveItems method of MyProfilerExample,
	 * we want to log the total number of put and get method calls
	 * on the Map object defined in MyProfilerExample.
	 */
	@AfterReturning("afterRetrievingData()")
	public void logCount(){
		
		logger.debug("******** put and get methods have been called a total of: " + count + " times ********");
	}	

}
