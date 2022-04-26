package bll;

import filesaving.FileSavingBill;
import bll.validators.BillCostValidator;
import bll.validators.BillProductIdAndClientIdValidator;
import bll.validators.BillQuantityValidator;
import bll.validators.Validator;
import model.Bill;
import dao.BillDAO;
import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * This class is used for Bill business logic operations.
 */
public class BillBLL {
    private List<Validator<Bill>> validators;
    private BillDAO billDAO;

    /**
     * Business logic constructor that validates the Bill input.
     */
    public BillBLL(){
        validators = new ArrayList<Validator<Bill>>();
        validators.add(new BillCostValidator());
        validators.add(new BillQuantityValidator());
        validators.add(new BillProductIdAndClientIdValidator());
        billDAO = new BillDAO();
    }

    /**
     * Business logic method to get an entry from a table by its id.
     * @param id
     * @return
     */
    public Bill findBillById(int id){
        Bill bill = billDAO.findBillById(id);
        if(bill == null){
            throw new NoSuchElementException("The bill with id =" + id + "was not found!");
        }
        return bill;
    }

    /**
     * Business logic method to insert a given Bill into bill table.
     * @param b
     * @return
     */
    public int insertBill(Bill b){
        for(Validator<Bill> v : validators){
            v.validate(b);
        }
        int x = billDAO.insertBill(b);
        if(x < 0){
            throw new NoSuchElementException(b.toString() + " was not inserted!");
        }
        return x;
    }

    /**
     * Business logic method to delete a Bill from bill table by its id.
     * @param id
     * @return
     */
    public int deleteBill(int id){
        int x= billDAO.deleteBill(id);
        if(x < 0){
            throw new NoSuchElementException("The bill with id =" + id + "could not be deleted!");
        }
        return x;
    }

    /**
     * Business logic method to update a Bill from bill table by its id.
     * @param b
     * @return
     */
    public int updateBill(Bill b){
        for(Validator<Bill> v : validators){
            v.validate(b);
        }
        int x= billDAO.updateBill(b);
        if(x < 0){
            throw new NoSuchElementException("The bill with id =" + b.getOrderId() + "could not be updated!");
        }
        return x;
    }

    /**
     * Business logic method to get all entries in bill table.
     * @return a list of all table entries
     */
    public List<Bill> findBillAll(){
        List<Bill> result = billDAO.findBillAll();
        if(result==null){
            throw new NoSuchElementException("Could not found any bills!");
        }
        return result;
    }
}
