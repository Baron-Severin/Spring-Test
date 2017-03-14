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
import javax.persistence.Query;

import com.javatunes.domain.MusicCategory;
import com.javatunes.domain.MusicItem;

public class JpaItemRepository implements ItemRepository {
	
	@PersistenceContext
	private EntityManager em;

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
		Query query = em.createQuery("FROM musicitem;");
		return (Collection<MusicItem>) query.getResultList();
	}

	@Override
	public Collection<MusicItem> searchByArtistTitle(String keyword) {
		Query query = em.createQuery("FROM MusicItem mi WHERE lower(mi.artist) LIKE lower('%" + keyword+"%')");
		return (Collection<MusicItem>) query.getResultList();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection<MusicItem> searchByCategory(MusicCategory category) {
		Query query = em.createQuery("FROM MusicItem mi WHERE mi.musicCategory = '" + category +"'");
		return (Collection<MusicItem>) query.getResultList();
	}

}
