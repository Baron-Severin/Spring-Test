/*
 * This code is sample code, provided as-is, and we make NO 
 * warranties as to its correctness or suitability for any purpose.
 * 
 * We hope that it's useful to you. Enjoy. 
 * Copyright Kiddcorp Inc.
 */
 
package com.javatunes.config;

import javax.inject.Inject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.javatunes.persistence.ItemRepository;
import com.javatunes.service.Catalog;
import com.javatunes.service.CatalogImpl;

@Configuration
public class SpringServicesConfig {
	
	// Inject the repository
	@Inject
	ItemRepository repository;
	
	// Define the catalog bean
	@Bean
	public Catalog catalog() {
		Catalog catalog = new CatalogImpl(repository);
		return catalog;
	}

}