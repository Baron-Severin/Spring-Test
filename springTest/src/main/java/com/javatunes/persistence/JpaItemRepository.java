/*
 * This code is sample code, provided as-is, and we make NO 
 * warranties as to its correctness or suitability for any purpose.
 * 
 * We hope that it's useful to you. Enjoy. 
 * Copyright Kiddcorp Inc.
 */

package com.javatunes.persistence;


import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.javatunes.domain.MusicCategory;
import com.javatunes.domain.MusicItem;

public class JpaItemRepository implements ItemRepository {
	
	@PersistenceContext
	private EntityManager em;
	
	private List<MusicItem> catalogData = new CatalogData();
	private Integer maxSearchResults = 30;

	public MusicItem get(Long id) {
		return em.find(MusicItem.class,id);
	}

	public void persist(MusicItem item) {
		em.persist(item);
		System.out.println(item + " persisted!");
	}

	public void remove(MusicItem item) {
		MusicItem mi = em.find(MusicItem.class, item.getId());
		em.remove(mi);
	}
	
	@Override
	public Collection<MusicItem> getAll() {
		// TODO Auto-generated method stub
		
//		return null;
	}

	@Override
	public Collection<MusicItem> searchByArtistTitle(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection<MusicItem> searchByCategory(MusicCategory category) {
		// TODO Auto-generated method stub
		return null;
	}

}
