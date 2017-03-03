/*
 * This code is sample code, provided as-is, and we make NO 
 * warranties as to its correctness or suitability for any purpose.
 * 
 * We hope that it's useful to you. Enjoy. 
 * Copyright Kiddcorp Inc.
 */

package com.javatunes.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

// Declare as an aspect
@Aspect
public class CatalogAspect {

	// Declares the below as a pointcut expression 
	@Pointcut("execution(* com.javatunes.service.Catalog.*(..))")
	public void anyCatalogMethod() {} // No body in this method
	
	
	// TODO: Add before advice associated with anyCatalogMethod pointcut
	@Before("anyCatalogMethod()")
	public void dbPing() {
		System.out.println("Pinging database ...");
	}


}