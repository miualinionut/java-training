package bll.validators;

import model.Bill;

/**
 * This class implements the interface Validator and has the main role to check
 * if the bill cost that is used at the creation of a new Bill object is valid
 */
public class BillCostValidator implements  Validator<Bill>{
    @Override
    public void validate(Bill bill) {
        if(bill.getCost() <0){
            throw new IllegalArgumentException("The bill's cost is not valid!");
        }
    }
}
