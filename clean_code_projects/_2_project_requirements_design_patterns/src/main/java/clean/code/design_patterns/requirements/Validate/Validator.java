package clean.code.design_patterns.requirements.Validate;

import clean.code.design_patterns.requirements.Domain.Doctor;

public class Validator implements IValidator {
    @Override
    public void validate(Doctor doctor) throws ValidationException {
        validateFirstName(doctor.getFirstName());
        validateLastName(doctor.getLastName());
        validateSpecialization(doctor.getSpecialization());
        validateSalary(doctor.getSalary());
    }

    private void validateSalary(double salary) {
        if (salary <= 0.0) {
            throw new ValidationException("The salary cannot be negative!");
        }
    }

    private void validateSpecialization(String specialization) {
        if (specialization == null || specialization.isEmpty()) {
            throw new ValidationException("Please enter a specialization!");
        }
    }

    private void validateLastName(String lastName) {
        if (lastName == null || lastName.isEmpty()) {
            throw new ValidationException("Please enter a last name!");
        }
    }

    private void validateFirstName(String firstName) {
        if (firstName == null || firstName.isEmpty()) {
            throw new ValidationException("Please enter a first name!");
        }
    }
}