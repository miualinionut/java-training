package clean.code.design_patterns.requirements.Validate;

import clean.code.design_patterns.requirements.Domain.Angajat;

public class AngajatValidator implements Validator {
    @Override
    public void validate(Angajat a) throws ValidationException {
        validateFirstName(a.getFirstName());
        validateLastName(a.getLastName());
        validateFunction(a.getFunction());
        validateSalary(a.getSalary());
    }

    private void validateSalary(double salary) {
        if(salary <= 0.0){
            throw new ValidationException("The salary cannot be negative!");
        }
    }

    private void validateFunction(String function) {
        if(function == null || function.isEmpty()){
            throw new ValidationException("Please enter a function!");
        }
    }

    private void validateLastName(String lastName) {
        if(lastName == null || lastName.isEmpty()){
            throw new ValidationException("Please enter a last name!");
        }

    }

    private void validateFirstName(String firstName) {
        if(firstName == null || firstName.isEmpty()){
            throw new ValidationException("Please enter a first name!");
        }
    }
}
