package com.example.servicenotification.validations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Constraint(validatedBy = PhoneNumberValidator.class)
@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPhoneNumber {

    String message() default "Numéro de téléphone invalide";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
