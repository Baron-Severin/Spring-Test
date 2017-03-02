/*
 * This code is sample code, provided as-is, and we make NO 
 * warranties as to its correctness or suitability for any purpose.
 * 
 * We hope that it's useful to you. Enjoy. 
 * Copyright Kiddcorp Inc.
 */

package com.javatunes.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.javatunes.service.Catalog;;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/configuration/applicationContext.xml")
public class UT_Catalog {
	
	@Autowired
	private ApplicationContext ctx;

	@Test
	public void catalogTest() {
		// This is replaced, information now found in class annotations
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

		Catalog catalog = ctx.getBean(Catalog.class);
		
		for (MusicItem musicItem : catalog.findByKeyword("a")) {
			System.out.println(musicItem);
		}
		
		ctx.close();
	}

}
