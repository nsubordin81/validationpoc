package example.validation.rules;

import example.validation.rules.mixins.NotNullOnDocId;
import example.validation.support.FakeRequestObject;

import java.util.ArrayList;
import java.util.List;

public class AlienNumberRuleSet implements NotNullOnDocId, Rule{
// for a real implementation, a separate enum class that names the documents by type e.g. "I551(1)" would be more readable
    public static final List<Integer> docTypes = new ArrayList<>();

    public List<String> fire(FakeRequestObject input) {
        final List<Integer> docTypes = new ArrayList<>();
        docTypes.add(2);
        docTypes.add(10);
        docTypes.add(26);
        docTypes.add(27);
        docTypes.add(30);

        List<String> results = new ArrayList<>();
        notNullOnDocId(docTypes, input.docTypeID, input.alienNumber, "alien number cannot be null").ifPresent(results::add);

        return results;
    }
}
