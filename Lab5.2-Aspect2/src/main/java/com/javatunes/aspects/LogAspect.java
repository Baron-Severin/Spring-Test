/*
 * This code is sample code, provided as-is, and we make NO 
 * warranties as to its correctness or suitability for any purpose.
 * 
 * We hope that it's useful to you. Enjoy. 
 * Copyright Kiddcorp Inc.
 */

package com.javatunes.aspects;

import org.aspectj.lang.JoinPoint.StaticPart;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

// Declare as an aspect
@Aspect
public class LogAspect {

	// Declare the pointcut for loggable methods
	@Pointcut("@annotation(com.javatunes.aspects.Loggable)")
	public void loggableMethods() {}
	
	// Declare the advice
	@Around("loggableMethods()")
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
			
		Object returnValue = joinPoint.proceed();
		System.out.println(buildString(Timing.AfterMethod, joinPoint, returnValue));

		return returnValue;
	}

	private String buildString( Timing beforeAfter,	ProceedingJoinPoint joinPoint, Object returnValue) {

		StringBuilder builder = new StringBuilder(512);
		char newLine = '\n';

		String kind = joinPoint.getKind();
		String arguments = argsToString(joinPoint.getArgs());
		Signature signature = joinPoint.getSignature();
		StaticPart staticPart = joinPoint.getStaticPart();
		Object target = joinPoint.getTarget();
		// Object thiz = joinPoint.getThis();

		builder.append(newLine)
				.append("LogAspect.log()").append(newLine)
		        .append(beforeAfter).append(newLine)
				.append("Kind:" + kind).append(newLine)
				.append("Arguments Passed to Method:" + arguments).append(newLine)
				.append("Method Signature:" + signature).append(newLine)
				.append("Static Part:" + staticPart.toShortString())
				.append(newLine).append("Target Object :" + target.getClass()).append(newLine)
				.append("Return Value:" + returnValue).append(newLine);

		return builder.toString();
	}

	private String argsToString(Object[] args) {
		StringBuilder argz = new StringBuilder(512);
		for (Object object : args) {
			argz.append(object).append(",");
		}
		if (argz.length() == 0) {
			return "";
		}

		return argz.toString().substring(0, argz.length() - 1);
	}

	enum Timing {
		BeforeMethod, AfterMethod
	}
	
}