/*
 * This code is sample code, provided as-is, and we make NO 
 * warranties as to its correctness or suitability for any purpose.
 * 
 * We hope that it's useful to you. Enjoy. 
 * Copyright Kiddcorp Inc.
 */
 
package com.javatunes.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// Declare as a Spring configuration class with @Configuration
@Configuration
//Import other config classes with @Import
@Import({ SpringDomainConfig.class, SpringRepositoryConfig.class, 
	SpringServicesConfig.class})
public class SpringConfig {
	
	
}

