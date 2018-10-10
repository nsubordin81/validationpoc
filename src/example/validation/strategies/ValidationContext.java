package example.validation.strategies;

import example.validation.support.FakeRequestObject;

import java.util.List;

public class ValidationContext {

    public static List<String> validate(FakeRequestObject input) {

        if(input.accessMethod == "WEB-3") {
            return new NoValidation().validate(input);
        } else {
            switch(input.clientSoftwareVersion) {
                case "37":
                    return new V37Validation().validate(input);
                default:
                    return new V33Validation().validate(input);
            }
        }


    }
}
