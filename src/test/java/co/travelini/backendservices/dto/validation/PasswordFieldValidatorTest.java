package co.travelini.backendservices.dto.validation;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import co.travelini.backendservices.dto.request.RegisterWithEmailDTO;

public class PasswordFieldValidatorTest {

    private static Validator validator;

    @BeforeClass
    public static void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void testInvalidPassword() {
    	RegisterWithEmailDTO userRegistration = new RegisterWithEmailDTO();
        userRegistration.setName("test");
        userRegistration.setEmail("info@travelini.com");
        userRegistration.setPassword("notvalid");

        Set<ConstraintViolation<RegisterWithEmailDTO>> constraintViolations = validator.validate(userRegistration);

        Assert.assertEquals(constraintViolations.size(), 1);
    }

    @Test
    public void testInvalidPasswordLength() {
    	RegisterWithEmailDTO userRegistration = new RegisterWithEmailDTO();
        userRegistration.setName("test");
        userRegistration.setEmail("info@travelini.com");
        userRegistration.setPassword("x3!dij");

        Set<ConstraintViolation<RegisterWithEmailDTO>> constraintViolations = validator.validate(userRegistration);

        Assert.assertEquals(constraintViolations.size(), 1);
    }
    
    @Test
    public void testValidPassword() {
    	RegisterWithEmailDTO userRegistration = new RegisterWithEmailDTO();
        userRegistration.setName("test");
        userRegistration.setEmail("info@travelini.com");
        userRegistration.setPassword("x3!dijssss");

        Set<ConstraintViolation<RegisterWithEmailDTO>> constraintViolations = validator.validate(userRegistration);

        Assert.assertEquals(constraintViolations.size(), 0);
    }
}