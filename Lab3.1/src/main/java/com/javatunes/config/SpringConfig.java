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
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;

// Declare as a Spring configuration class
// and import other configuration classes
@Configuration
// Add property source to read the properties file
@PropertySource("classpath:javatunes.properties")
@Import({SpringRepositoryConfig.class, SpringServicesConfig.class})  // Include Optional SpringDomainConfig
public class SpringConfig {
	
	// Note: We configure a conversion service for illustration only.
	@Bean
	public ConversionService conversionService() {
		return new ConversionServiceFactoryBean().getObject();
	}
	
	
}