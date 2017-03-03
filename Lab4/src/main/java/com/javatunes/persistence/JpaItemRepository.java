/*
 * This code is sample code, provided as-is, and we make NO 
 * warranties as to its correctness or suitability for any purpose.
 * 
 * We hope that it's useful to you. Enjoy. 
 * Copyright Kiddcorp Inc.
 */

package com.javatunes.persistence;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.javatunes.domain.MusicItem;

public class JpaItemRepository implements ItemRepository {
	
	// Inject the EM
	// Will inject based on type, in this case org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean in data.xml
	@PersistenceContext
	// May also be attached manually
//	@PersistenceContext("NAME")
	private EntityManager em;

	public MusicItem get(Long id) {
	    // Call EntityManager.find() and return the result
		return em.find(MusicItem.class, id);
	}

	@Override
	public Collection<MusicItem> getAll() {
		// Not implemented
		return null;
	}

	@Override
	public Collection<MusicItem> searchByArtistTitle(String keyword) {
		// Not implemented
		return null;
	}

	@Override
	public int size() {
		// Not implemented
		return 0;
	}

}
