package dao;

import model.Bill;
import model.Customer;

import java.util.List;

/**
 * Class for bill-based data access operations.
 */
public class BillDAO extends AbstractDAO<Bill>{
    /**
     * Method that insert a new Bill in the table.
     * @param t
     * @return
     */
    public  int insertBill(Bill t){
        return insert(t);
    }

    /**
     * Method that deletes a bill from the table based on its id.
     * @param billId
     * @return
     */

    public int deleteBill(int billId){
        return delete(billId);
    }

    /**
     * Method that updates a bill from the table based on its id.
     * @param t
     * @return
     */
    public  int updateBill(Bill t){
        return update(t);
    }

    /**
     * Method that returns a Bill from the table based on its id.
     * @param id
     * @return
     */
    public  Bill findBillById(int id){
        return findById(id);
    }

    /**
     * Method that returns a list of Bill that contain all the bills from the table.
     * @return
     */
    public List<Bill> findBillAll(){
        return findAll();
    }
}
