/*
 * This code is sample code, provided as-is, and we make NO 
 * warranties as to its correctness or suitability for any purpose.
 * 
 * We hope that it's useful to you. Enjoy. 
 * Copyright Kiddcorp Inc.
 */

package com.javatunes.service;

import java.util.Collection;

import javax.inject.Inject;
import javax.inject.Named;

import com.javatunes.domain.MusicItem;
import com.javatunes.persistence.ItemRepository;

// Declare as a bean with id musicCatalog
@Named
public class CatalogImpl implements Catalog {

	// Inject the repository
	// Note that itemRepository is an interface. It finds an implementation
	// within your code, and inject that. Note that this can be bad if you have
	// a secondary mock implementation
	@Inject
	private ItemRepository itemRepository;


	public void setItemRepository(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}

	public MusicItem findById(Long id) {
		return itemRepository.get(id);
	}

	public Collection<MusicItem> findByKeyword(String keyword) {
		return itemRepository.searchByArtistTitle(keyword);
	}

	@Override
	public int size() {
		return itemRepository.size();
	}
	
	@Override
	public String toString() {
		return "I am a shiny new " + getClass().getName() + " brought to you from Spring" + " but you can just call me " + getClass().getInterfaces()[0] + ".  My itemRepository is " + itemRepository;
	}

}
