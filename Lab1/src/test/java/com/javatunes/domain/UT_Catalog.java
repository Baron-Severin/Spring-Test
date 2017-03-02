/*
 * This code is sample code, provided as-is, and we make NO 
 * warranties as to its correctness or suitability for any purpose.
 * 
 * We hope that it's useful to you. Enjoy. 
 * Copyright Kiddcorp Inc.
 */

package com.javatunes.domain;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.macys.Registry;


public class UT_Catalog {

	@Test
	public void catalogTest() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		assertTrue("spring container should not be null", ctx != null);
		
		Registry reg1 = ctx.getBean("registry", Registry.class);
		Registry reg2 = ctx.getBean("registry", Registry.class);
		
		reg1.put("name1", "value1");
		reg2.put("name2", "value2");

		System.out.println(reg1);
		
		Registry reg3 = Registry.getInstance();
		System.out.println(reg3);
		
		/*
		 * Look up the musicCatalog and invoke its toString method.  
		 * Don't forget to close spring context
		 */
//		Catalog cat = ctx.getBean("musicCatalog", Catalog.class);
		
//		assertTrue("bean can't be null", cat != null);
//
//		assertTrue("size wrong", cat.size() == 18);
//
//		Collection<MusicItem> items = cat.findByKeyword("a");
//		for (Iterator iterator = items.iterator(); iterator.hasNext();) {
//			MusicItem musicItem = (MusicItem) iterator.next();
//			System.out.println(musicItem.getTitle());
//		}
	}
}
