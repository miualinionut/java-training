package bll.validators;

import model.Customer;

/**
 * This class implements the interface Validator and has the main role to check
 * if the value of age used at the creation of a new object is valid
 */

public class CustomerAgeValidator implements  Validator<Customer>{
    public static final int MIN_AGE = 7;
    public static final int MAX_AGE = 99;
    @Override
    public void validate(Customer customer) {
        if(customer.getAge() < MIN_AGE || customer.getAge() > MAX_AGE){
            throw new IllegalArgumentException("The customer age limit is not respected!");
        }

    }
}
