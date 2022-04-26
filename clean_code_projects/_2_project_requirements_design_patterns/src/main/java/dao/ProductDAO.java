package dao;

import model.Customer;
import model.Product;

import java.util.List;

/**
 * Class for product-based data access operations.
 */
public class ProductDAO extends AbstractDAO<Product>{
    /**
     * Method that inserts a new Product in the table.
     * @param t
     * @return
     */
    public int insertProduct(Product t){
        return insert(t);
    }

    /**
     * Method that deletes a Product from the table based on its id.
     * @param productId
     * @return
     */
    public int deleteProduct(int productId){
        return delete(productId);
    }

    /**
     * Method that updates a Product from the table based on its id.
     * @param t
     * @return
     */
    public int updateProduct(Product t){
        return update(t);
    }

    /**
     * Method that returns a Product from the table based on its id.
     * @param id
     * @return
     */
    public Product findProductById(int id){
        return findById(id);
    }

    /**
     * Method that returns a list of Product objects that contain all the products from the table.
     * @return
     */
    public List<Product> findProductAll(){
        return findAll();
    }
}
