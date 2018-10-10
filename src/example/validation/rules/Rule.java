package example.validation.rules;

import example.validation.support.FakeRequestObject;

import java.util.List;

public interface Rule {
    List<String> fire(FakeRequestObject input);
}
