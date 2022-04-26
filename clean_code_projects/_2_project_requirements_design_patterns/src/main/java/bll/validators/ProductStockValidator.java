package bll.validators;

import model.Product;

/**
 * This class implements the interface Validator and has the main role to check
 * if the stock value used at the creation of a new Product is valid(is a positive value)
 */

public class ProductStockValidator implements  Validator<Product>{
    @Override
    public void validate(Product p){
        if (p.getStock() <= 0){
            throw new IllegalArgumentException("The product stock is not valid!");
        }
    }
}
