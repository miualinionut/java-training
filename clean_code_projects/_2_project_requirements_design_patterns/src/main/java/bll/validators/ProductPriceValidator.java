package bll.validators;

import model.Product;

/**
 * This class implements the interface Validator and has the main role to check
 * if the price used at the creation of a new product is a valid one (has a positive value)
 */

public class ProductPriceValidator implements  Validator<Product>{
    @Override
    public void validate(Product p){
        if (p.getPrice() <= 0){
            throw new IllegalArgumentException("The product price is not valid!");
        }
    }
}
