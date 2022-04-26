package bll.validators;

import model.Customer;

/**
 * This class implements the interface Validator and has the main role to check
 * if the value of address used at the creation of a new object of Customer class is valid
 */

public class CustomerAddressValidator implements  Validator<Customer> {
    @Override
    public void validate(Customer c){
        if(c.getAddress().length() <2){
            throw new IllegalArgumentException("The customer address is not a valid one!");
        }
    }
}
