package start;

import bll.BillBLL;
import bll.CustomerBLL;
import bll.ProductBLL;
import model.Bill;
import model.Customer;
import model.Product;
import presentation.controller.BillController;
import presentation.controller.CustomerController;
import presentation.controller.MainController;
import presentation.controller.ProductController;
import presentation.view.ProductView;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Start class - class that contains the psv main method that runs the application implemented
 * its main method instantiates a MainController object that has the role to start the application
 */
public class Start {
    //protected static final Logger LOGGER = Logger.getLogger(Start.class.getName());

    public static void main(String[] args) {
        MainController mainController = new MainController();
       }
}
