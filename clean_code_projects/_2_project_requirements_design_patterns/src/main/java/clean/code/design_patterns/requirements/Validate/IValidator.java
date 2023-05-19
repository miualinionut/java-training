package clean.code.design_patterns.requirements.Validate;


import clean.code.design_patterns.requirements.Domain.Doctor;

public interface IValidator {
    void validate(Doctor doctor) throws ValidationException;
}