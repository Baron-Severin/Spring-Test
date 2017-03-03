/*
 * This code is sample code, provided as-is, and we make NO 
 * warranties as to its correctness or suitability for any purpose.
 * 
 * We hope that it's useful to you. Enjoy. 
 * Copyright Kiddcorp Inc.
 */

package com.javatunes.persistence;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

//@Qualifier affects how other annotations are processed
@Qualifier
//@Retention determines how long annotations are used
//Source will be thrown out after compiling
//Class is available when classes are being loaded, but thrown out at runtime
//Runtime works at runtime
@Retention(RetentionPolicy.RUNTIME)
//@Target sets where the annotation can be used
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface InMemory {

}
