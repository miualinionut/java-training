package dao;

import model.Customer;

import java.util.List;

/**
 * Class for customer-based data access operations.
 */
public class CustomerDAO extends AbstractDAO<Customer>{
    /**
     * Method that insert a new Customer in the customer table.
     * @param t
     * @return
     */
    public int insertCustomer(Customer t){
        return insert(t);
    }

    /**
     * Method that deletes a Customer from the table based on its id.
     * @param customerId
     * @return
     */
    public int deleteCustomer(int customerId){
        return delete(customerId);
    }

    /**
     * Method that updates a Customer from the table based on its id.
     * @param t
     * @return
     */
    public int updateCustomer(Customer t){
        return update(t);
    }

    /**
     * Method that returns a Customer from the table based on its id.
     * @param id
     * @return
     */
    public Customer findCustomerById(int id){
        return findById(id);
    }

    /**
     * Method that returns a list of Customer that contains all the customers in the table.
     * @return
     */
    public List<Customer> findCustomerAll(){
        return findAll();
    }
}
