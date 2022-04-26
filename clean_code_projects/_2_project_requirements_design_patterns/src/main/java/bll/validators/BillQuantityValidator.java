package bll.validators;

import model.Bill;
/**
 * This class implements the interface Validator and has the main role to check
 * the quantity used in the constructor of a new Bill has a valid value
 */
public class BillQuantityValidator implements  Validator<Bill>{
    @Override
    public void validate(Bill bill) {
        if(bill.getQuantity() < 0){
            throw new IllegalArgumentException("The bill's quantity is not valid!");
        }
    }
}
