package com.macys;

import java.util.HashMap;

public class Registry extends HashMap<String,Object> {
	
	private static Registry reg = new Registry();

	// Spring uses reflection to access this private constructor
	private Registry() {}
	
	// Spring does not know to use getInstance
	// DO NOT DO THIS
	public static Registry getInstance() {
		return reg;
	}
	
	
}
