package example.validation.strategies;

import example.validation.support.FakeRequestObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ValidationContextTest {

    ValidationContext context;

    @Before
    public void setUp() {
        context = new ValidationContext();
    }

    @Test
    public void testValidateWithAlienNumber() {
        //arrange
        FakeRequestObject subject = new FakeRequestObject("A123456789", 2, "WS-AGN", "37");
        //act
        List<String> validationResult = ValidationContext.validate(subject);
        //assert
        Assert.assertEquals(new ArrayList<String>(), validationResult);
    }
}
