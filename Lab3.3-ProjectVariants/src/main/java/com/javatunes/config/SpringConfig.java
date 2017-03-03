/*
 * This code is sample code, provided as-is, and we make NO 
 * warranties as to its correctness or suitability for any purpose.
 * 
 * We hope that it's useful to you. Enjoy. 
 * Copyright Kiddcorp Inc.
 */
 
package com.javatunes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;

// Declare as a Spring configuration class
// and import other configuration classes
@Configuration
// @ComponentScan is like XML from earlier versions. This tells Spring where to look for Spring annotations
@ComponentScan(basePackages = "com.javatunes")
@Import( { DevConfig.class, ProductionConfig.class } ) 
public class SpringConfig {
	
	public static final String dev = "DEV";
	public static final String production = "PROD";
	
	// Note: We configure a conversion service for illustration only.
	@Bean
	public ConversionService conversionService() {
		return new ConversionServiceFactoryBean().getObject();
	}
	
	
}