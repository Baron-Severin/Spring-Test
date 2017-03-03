/*
 * This code is sample code, provided as-is, and we make NO 
 * warranties as to its correctness or suitability for any purpose.
 * 
 * We hope that it's useful to you. Enjoy. 
 * Copyright Kiddcorp Inc.
 */
 
package com.javatunes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.javatunes.aspects.LogAspect;

// Declare as a Spring configuration class
@Configuration
public class SpringAspectsConfig {
	
	// Declare LogAspect as a bean
	@Bean
	public LogAspect logAspect() {
		return new LogAspect();
	}

}