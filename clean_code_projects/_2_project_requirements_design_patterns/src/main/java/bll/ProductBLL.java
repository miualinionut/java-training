package bll;

import bll.validators.*;
import dao.ProductDAO;
import dao.ProductDAO;
import model.Product;
import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
/**
 * This class is used for Customer business logic operations.
 */
public class ProductBLL {
    private List<Validator<Product>> validators;
    private ProductDAO productDAO;
    /**
     * Business logic constructor that validates the Product input.
     */
    public ProductBLL(){
        validators = new ArrayList<Validator<Product>>();
        validators.add(new ProductStockValidator());
        validators.add(new ProductPriceValidator());
        validators.add(new ProductNameValidator());
        productDAO = new ProductDAO();
    }


    /**
     * Business logic method to get an entry from a table by its id.
     * @param id
     * @return
     */
    public Product findProductById(int id){
        Product product = productDAO.findProductById(id);
        if(product == null){
            throw new NoSuchElementException("The product with id =" + id + "was not found!");
        }
        return product;
    }
    /**
     * Business logic method to insert a given Product into product table.
     * @param b
     * @return
     */
    public int insertProduct(Product b){
        for(Validator<Product> v : validators){
            v.validate(b);
        }
        int x = productDAO.insertProduct(b);
        if(x < 0){
            throw new NoSuchElementException(b.toString() + " was not inserted!");
        }
        return x;
    }
    /**
     * Business logic method to delete a Product from product table by its id.
     * @param id
     * @return
     */
    public int deleteProduct(int id){
        int x= productDAO.deleteProduct(id);
        if(x < 0){
            throw new NoSuchElementException("The product with id =" + id + "could not be deleted!");
        }
        return x;
    }
    /**
     * Business logic method to update a Product from product table by its id.
     * @param b
     * @return
     */
    public int updateProduct(Product b){
        for(Validator<Product> v : validators){
            v.validate(b);
        }
        int x= productDAO.updateProduct(b);
        if(x < 0){
            throw new NoSuchElementException("The product with id =" + b.getId() + "could not be updated!");
        }
        return x;
    }
    /**
     * Business logic method to get all entries in product table.
     * @return a list of all table entries
     */
    public List<Product> findProductAll(){
        List<Product> result =productDAO.findProductAll();
        if(result==null){
            throw new NoSuchElementException("Could not found any products!");
        }
        return result;
    }
}