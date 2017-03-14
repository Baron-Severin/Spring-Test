/*
 * This code is sample code, provided as-is, and we make NO 
 * warranties as to its correctness or suitability for any purpose.
 * 
 * We hope that it's useful to you. Enjoy. 
 * Copyright Kiddcorp Inc.
 */

package com.javatunes.domain;

public enum MusicCategory {
	Blues,Classical,Jazz,Rap,Country, Pop, Alternative, Rock, Classic_Rock;
	
	public String getName() {
		return this.name();
	}
	
	public int getOrdinal() {
		return this.ordinal();
	}
	
}
