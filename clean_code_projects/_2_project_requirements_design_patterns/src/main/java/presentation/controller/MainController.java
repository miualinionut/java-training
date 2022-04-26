package presentation.controller;

import presentation.view.MainView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class is the controller of MainView
 * Based on which button is clicked, this class will open the selected window of the interface
 */
public class MainController {
    private MainView mainView = null;

    /**
     * MainController constructor.
     */
    public MainController(){
        this.mainView = new MainView();
        mainView.frmWareHouseSystem.setVisible(true);
        mainView.addCustomerManagementListener(new CustomerManagementAction());
        mainView.addOrdersManagementListener(new OrdersManagementAction());
        mainView.addProductManagementListener(new ProductManagementAction());
    }

    /**
     * This class defines what the application should do when user clicks on Customer Management button.
     */
    public class CustomerManagementAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            CustomerController customerController= new CustomerController();
        }
    }
    /**
     * This class defines what the application should do when user clicks on Bill Management button.
     */
    public class OrdersManagementAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            BillController billController= new BillController();
        }
    }
    /**
     * This class defines what the application should do when user clicks on Product Management button.
     */
    public class ProductManagementAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            ProductController productController= new ProductController();
        }
    }
}
