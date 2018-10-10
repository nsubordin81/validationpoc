package example.validation.rules;

import example.validation.support.FakeRequestObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

// make this implement the more generic notnullifdocid mixin and just set the docidlist on it
public class AlienNumberRuleSetTest {

    AlienNumberRuleSet alienNumberRule;

    @Before
    public void setUp() {
        alienNumberRule = new AlienNumberRuleSet();
    }

    @Test
    public void testAlienNumberNotNullOnValidDocType() {
        //arrange
        FakeRequestObject subject = new FakeRequestObject("A123456789", 2, "WEB-3", "37");
        //act
        List<String> predicateResult = alienNumberRule.fire(subject);
        //assert
        Assert.assertEquals(new ArrayList<String>(), predicateResult);
    }

}