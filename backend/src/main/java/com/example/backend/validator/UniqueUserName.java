package com.example.backend.validator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = { UniqueUserNameValidator.class })
public @interface UniqueUserName {

	String message() default "{backend.constraints.UniqueUserName.message}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
