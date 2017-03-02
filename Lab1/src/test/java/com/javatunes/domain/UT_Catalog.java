/*
 * This code is sample code, provided as-is, and we make NO 
 * warranties as to its correctness or suitability for any purpose.
 * 
 * We hope that it's useful to you. Enjoy. 
 * Copyright Kiddcorp Inc.
 */

package com.javatunes.domain;

import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.Iterator;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javatunes.service.Catalog;

public class UT_Catalog {

	@Test
	public void catalogTest() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		assertTrue("spring container should not be null", ctx != null);

		/*
		 * Look up the musicCatalog and invoke its toString method.  
		 * Don't forget to close spring context
		 */
		Catalog cat = ctx.getBean("musicCatalog", Catalog.class);
		assertTrue("bean can't be null", cat != null);

		assertTrue("size wrong", cat.size() == 18);

		Collection<MusicItem> items = cat.findByKeyword("a");
		for (Iterator iterator = items.iterator(); iterator.hasNext();) {
			MusicItem musicItem = (MusicItem) iterator.next();
			System.out.println(musicItem.getTitle());
		}
	}
}
