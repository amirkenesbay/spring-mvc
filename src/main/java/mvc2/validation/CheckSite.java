package mvc2.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckSiteValidator.class)
public @interface CheckSite {
    public String value() default ".com";
    public String message() default "web site domain must ends with .com";

    public Class<?>[] groups() default {};
    public Class<? extends Payload> [] payload() default {};
}
