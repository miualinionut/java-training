package bll.validators;

import model.Product;

/**
 * This class implements the interface Validator and has the main role to check
 * if the name used at the creation of a new product is a valid one (not a null string)
 */

public class ProductNameValidator implements  Validator<Product>{

    @Override
    public void validate(Product product) {
        if(product.getName() == ""){
            throw  new IllegalArgumentException("The product name is not valid!");
        }
    }
}
