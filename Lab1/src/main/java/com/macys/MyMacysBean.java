package com.macys;

import com.javatunes.persistence.ItemRepository;

public class MyMacysBean {
	
	private ItemRepository itemRepository;
	
	public MyMacysBean() {
		System.out.println("MyMacysBean constructing...");
	}
	
	public void init() {
		System.out.println("Do something exciting on init");
	}

	public ItemRepository getItemRepository() {
		return itemRepository;
	}

	public void setItemRepository(ItemRepository itemRepository) {
		System.out.println("Item repo set in MyMacysBean");
		this.itemRepository = itemRepository;
	}
	
	

}
