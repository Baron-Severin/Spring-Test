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
import org.springframework.core.env.Environment;

import com.javatunes.persistence.InMemoryItemRepository;
import com.javatunes.persistence.ItemRepository;

// Declare as a configuration class
@Configuration
public class SpringRepositoryConfig {
	
	// Inject the environment
	@Inject
	Environment env;
	
	
	// Declare the item repository bean
	@Bean
	public ItemRepository itemRepository() {
		// Pass a CatalogData to the repository
		InMemoryItemRepository rep = new InMemoryItemRepository();
		
		int maxSearchResults = env.getProperty("javatunes.repository.maxSearchResults", Integer.class);
		// Retrieve the maxSearchResults property from the environment (as an Integer)
		rep.setMaxSearchResults(maxSearchResults);
		// Initialize the maxSearchResults property or rep using it

		return rep;
	}
}