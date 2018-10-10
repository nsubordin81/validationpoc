package example.validation.strategies;

import example.validation.rules.AlienNumberRuleSet;
import example.validation.support.FakeRequestObject;
import example.validation.rules.Rule;

import java.util.ArrayList;
import java.util.List;

public interface ValidationStrategy {

    List<String> validate(FakeRequestObject input);

    List<Rule> getVersionSpecificRules();

    default List<Rule> getSharedRules() {

        List<Rule> rules = new ArrayList<>();
        rules.add(new AlienNumberRuleSet());
        return rules;
    }

    default public List<String> fireRules(List<Rule> rules, FakeRequestObject input) {

        List<String> resultAccumulator = new ArrayList<>();

        for(Rule rule : rules) {
                List<String> result = rule.fire(input);
                resultAccumulator.addAll(result);
        }

        return resultAccumulator;
    }
}
