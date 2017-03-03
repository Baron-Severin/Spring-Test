package com.javatunes.persistence;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

@Qualifier
// RetentionPolicy determines how long annotations are used
// Source will be thrown out after compiling
// Class is available when classes are being loaded, but thrown out at runtime
// Runtime works at runtime
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface Cloud {
	
}
