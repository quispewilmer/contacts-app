package me.contact.contacts.validation;

import me.contact.contacts.annotation.validation.MatchPasswords;
import me.contact.contacts.model.User;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MatchPasswordsValidator implements ConstraintValidator<MatchPasswords, Object> {
    @Override
    public void initialize(MatchPasswords constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        User user = (User) o;
        return user.getPassword().equals(user.getRepeatPassword());
    }
}
