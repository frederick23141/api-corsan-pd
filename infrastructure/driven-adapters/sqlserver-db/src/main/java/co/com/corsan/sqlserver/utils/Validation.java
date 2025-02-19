package co.com.corsan.sqlserver.utils;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;

import java.util.Set;
import java.util.StringJoiner;

public class Validation {

    private static final Validator validator =
            jakarta.validation.Validation.buildDefaultValidatorFactory().getValidator();

    public static String validate(Object object) {
        StringJoiner validationResponse = new StringJoiner(" - ");
        Set<ConstraintViolation<Object>> violations = validator.validate(object);

        if (!violations.isEmpty()) {
            violations.forEach(violation -> validationResponse.add(violation.getMessageTemplate()));
        }
        return validationResponse.toString();
    }
}
