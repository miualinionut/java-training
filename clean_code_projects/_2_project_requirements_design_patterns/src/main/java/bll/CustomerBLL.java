package bll;

import bll.validators.*;
import dao.CustomerDAO;
import model.Customer;
import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
/**
 * This class is used for Customer business logic operations.
 */
public class CustomerBLL {
    private List<Validator<Customer>> validators;
    private CustomerDAO customerDAO;
    /**
     * Business logic constructor that validates the Customer input.
     */
    public CustomerBLL(){
        validators = new ArrayList<Validator<Customer>>();
        validators.add(new CustomerAddressValidator());
        validators.add(new CustomerAgeValidator());
        validators.add(new EmailValidator());
        customerDAO = new CustomerDAO();
    }
    /**
     * Business logic method to get an entry from a table by its id.
     * @param id
     * @return
     */
    public Customer findCustomerById(int id){
        Customer c = customerDAO.findCustomerById(id);
        if(c == null){
            throw new NoSuchElementException("The customer with id =" + id + " was not found!");
        }
        return c;
    }
    /**
     * Business logic method to insert a given Customer into customer table.
     * @param b
     * @return
     */
    public int insertCustomer(Customer b){
        for(Validator<Customer> v : validators){
            v.validate(b);
        }
        int x = customerDAO.insertCustomer(b);
        if(x < 0){
            throw new NoSuchElementException(b.toString() + " was not inserted!");
        }
        return x;
    }
    /**
     * Business logic method to delete a Customer from customer table by its id.
     * @param id
     * @return
     */
    public int deleteCustomer(int id){
        int x= customerDAO.deleteCustomer(id);
        if(x < 0){
            throw new NoSuchElementException("The customer with id =" + id + " could not be deleted!");
        }
        return x;
    }


    /**
     * Business logic method to update a Customer from customer table by its id.
     * @param b
     * @return
     */
    public int updateCustomer(Customer b){
        for(Validator<Customer> v : validators){
            v.validate(b);
        }
        int x= customerDAO.updateCustomer(b);
        if(x < 0){
            throw new NoSuchElementException("The customer with id =" + b.getId() + " could not be updated!");
        }
        return x;
    }

    /**
     * Business logic method to get all entries in customer table.
     * @return a list of all table entries
     */
    public List<Customer> findCustomerAll(){
        List<Customer> result = customerDAO.findCustomerAll();
        if(result==null){
            throw new NoSuchElementException("Could not found any customers!");
        }
        return result;
    }
}