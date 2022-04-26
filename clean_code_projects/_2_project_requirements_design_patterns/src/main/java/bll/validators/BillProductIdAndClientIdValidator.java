package bll.validators;

import bll.CustomerBLL;
import bll.ProductBLL;
import model.Bill;
import model.Product;

import java.util.NoSuchElementException;
/**
 * This class implements the interface Validator and has the main role to check
 * the productId and the clientId is valid - if these ids appears in customer and product tables
 */
public class BillProductIdAndClientIdValidator implements Validator<Bill>{

    @Override
    public void validate(Bill bill) {
        ProductBLL productBll = new ProductBLL();
        CustomerBLL customerBLL = new CustomerBLL();
        int productId = bill.getProductId();
        int clientId= bill.getClientId();
        int pidtemp = productBll.findProductById(productId).getId();
        int cidtemp = customerBLL.findCustomerById(clientId).getId();
        if(pidtemp != productId || clientId != cidtemp){
            throw new NoSuchElementException("The inserted product/client id does not exist!");
        }

    }
}
