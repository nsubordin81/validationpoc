package example.validation.strategies;

import example.validation.rules.Rule;
import example.validation.support.FakeRequestObject;

import java.util.List;

public class V33Validation implements ValidationStrategy{
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
