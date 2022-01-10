package mvc2.validation;

import com.amirkenesbay.spring.mvc.validation.CheckEmail;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class CheckSiteValidator implements ConstraintValidator<CheckSite, String> {
    private String endOfWebSite;

    @Override
    public boolean isValid(String enteredValue, ConstraintValidatorContext constraintValidatorContext) {
        return enteredValue.endsWith(endOfWebSite);
    }

    @Override
    public void initialize(CheckSite checkSite) {
        endOfWebSite = checkSite.value();
    }
}