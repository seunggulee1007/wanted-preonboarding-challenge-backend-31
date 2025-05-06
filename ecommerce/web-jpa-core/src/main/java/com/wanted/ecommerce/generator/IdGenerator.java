package com.wanted.ecommerce.generator;

import org.hibernate.annotations.IdGeneratorType;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@IdGeneratorType(GeneralIdGenerator.class)
@Target({METHOD, FIELD})
@Retention(RUNTIME)
public @interface IdGenerator {

}
