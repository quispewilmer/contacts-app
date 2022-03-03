package me.contact.contacts.validation;

import me.contact.contacts.annotation.validation.ValidPhone;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidator implements ConstraintValidator<ValidPhone, String> {
    Pattern pattern;
    Matcher matcher;
    private final String PHONE_PATTERN = "[0-9]{9,11}";

    @Override
    public void initialize(ValidPhone constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        pattern = Pattern.compile(PHONE_PATTERN);
        matcher = pattern.matcher(s);

        return matcher.matches();
    }
}
