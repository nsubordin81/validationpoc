package example.validation.strategies;

import example.validation.support.FakeRequestObject;
import example.validation.rules.Rule;

import java.util.List;

public class NoValidation implements ValidationStrategy {

    @Override
    public List<String> validate(FakeRequestObject input) {
        return null;
    }

    @Override
    public List<Rule> getVersionSpecificRules() {
        return null;
    }
}
