package example.validation.strategies;

import example.validation.support.FakeRequestObject;
import example.validation.rules.Rule;

import java.util.List;

public class V37Validation implements ValidationStrategy {


    @Override
    public List<String> validate(FakeRequestObject input) {
        List<Rule> rules = getSharedRules();
        return fireRules(rules, input);
    }

    @Override
    public List<Rule> getVersionSpecificRules() {
        return null;
    }
}
