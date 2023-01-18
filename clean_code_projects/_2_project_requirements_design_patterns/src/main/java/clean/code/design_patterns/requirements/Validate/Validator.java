package clean.code.design_patterns.requirements.Validate;

import clean.code.design_patterns.requirements.Domain.Angajat;
import clean.code.design_patterns.requirements.Validate.ValidationException;

public interface Validator {
    void validate(Angajat a) throws ValidationException;
}
