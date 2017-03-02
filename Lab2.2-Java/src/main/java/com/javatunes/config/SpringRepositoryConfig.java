/*
 * This code is sample code, provided as-is, and we make NO 
 * warranties as to its correctness or suitability for any purpose.
 * 
 * We hope that it's useful to you. Enjoy. 
 * Copyright Kiddcorp Inc.
 */
 
package com.javatunes.config;

import javax.inject.Inject;

import org.springframework.context.annotation.Configuration;

import com.javatunes.persistence.InMemoryItemRepository;
import com.javatunes.persistence.ItemRepository;

// Declare as a configuration class
@Configuration
public class SpringRepositoryConfig {

	// Declare the item repository bean
	@Inject
	private Integer maxSearchResults;
	
	
	public ItemRepository itemRepository() {
		InMemoryItemRepository rep = new InMemoryItemRepository();
		rep.setMaxSearchResults(maxSearchResults);
		return rep;
	}

}