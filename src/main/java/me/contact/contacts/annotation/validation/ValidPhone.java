package me.contact.contacts.annotation.validation;

import me.contact.contacts.validation.PhoneValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target({ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PhoneValidator.class)
public @interface ValidPhone {
    String message() default "Put a valid email.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
