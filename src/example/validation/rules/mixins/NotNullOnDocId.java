package example.validation.rules.mixins;

import java.util.List;
import java.util.Optional;

public interface NotNullOnDocId {
    default Optional<String> notNullOnDocId(List<Integer> docIDList, int docId, Object field, String message) {
        if(docIDList.contains(docId) && Optional.ofNullable(field).equals(Optional.empty())) {
            return Optional.of("alien number cannot be null for this doc ID");
        } else {
            return Optional.empty();
        }
    }
}
