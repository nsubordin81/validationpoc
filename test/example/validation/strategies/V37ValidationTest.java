package example.validation.strategies;

import example.validation.support.FakeRequestObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class V37ValidationTest {

    ValidationStrategy validationStrategy;

    @Before
    public void setUp() {
        validationStrategy = new V37Validation();
    }

    @Test
    public void testValidateWithAlienNumber() {
        //arrange
        FakeRequestObject subject = new FakeRequestObject("A123456789", 2, "WEB-3", "37");
        //act
        List<String> validationResult = validationStrategy.validate(subject);
        //assert
        Assert.assertEquals(new ArrayList<String>(), validationResult);
    }
}
