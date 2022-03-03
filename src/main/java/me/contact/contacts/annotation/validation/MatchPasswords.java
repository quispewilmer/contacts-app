package me.contact.contacts.annotation.validation;

import me.contact.contacts.validation.MatchPasswordsValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE_PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MatchPasswordsValidator.class)
public @interface MatchPasswords {
    String message() default "Passwords don't match.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
