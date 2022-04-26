package presentation.controller;

import bll.CustomerBLL;
import model.Customer;
import model.Product;
import presentation.view.CustomerView;

import java.awt.event.*;
import java.lang.reflect.Field;
import java.util.List;
/**
 * This class is the controller of CustomerView.
 */
public class CustomerController {
    private CustomerBLL customerBLL = null;
    private CustomerView customerView = null;
    private int indexTable;
    /**
     * CustomerController constructor.
     */
    public CustomerController(){
        this.customerBLL = new CustomerBLL();
        this.customerView = new CustomerView();
        customerView.frmCustomerManagementSystem.setVisible(true);
        customerView.addRefreshListener(new RefreshAction());
        customerView.addAddListener(new AddAction());
        customerView.addDeleteListener(new DeleteAction());
        customerView.addEditListener(new EditAction());
        customerView.addTableListener(new TableAction());
        customerView.addTextFieldFocusAdapter(new TextFieldAction());
    }
    /**
     * This class defines what the application should do when user clicks on Refresh button.
     */
    public class RefreshAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            customerView.refreshFields();
            try{
                customerView.setTableProductsColumns(getData(customerBLL.findCustomerAll()), getColumns());
            } catch (IllegalAccessException ex){
                ex.printStackTrace();
            }
        }
    }
    /**
     * This class defines what the application should do when user clicks on Add button.
     */
    public class AddAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = customerView.getUserNameInput();
            String address = customerView.getUserAddressInput();
            String email = customerView.getUserEmailInput();
            int age = customerView.getUserAgeInput();
            Customer cTemp = new Customer(name, address, email, age);
            customerBLL.insertCustomer(cTemp);
        }
    }
    /**
     * This class defines what the application should do when user clicks on Delete button.
     */
    public class DeleteAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int id = customerView.getUserIdInput();
            customerBLL.deleteCustomer(id);
        }
    }
    /**
     * This class defines what the application should do when user clicks on Update button.
     */
    public class EditAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int id = customerView.getUserIdInput();
            String name = customerView.getUserNameInput();
            String address = customerView.getUserAddressInput();
            String email = customerView.getUserEmailInput();
            int age = customerView.getUserAgeInput();
            Customer cTemp = new Customer(id,name, address, email, age);
            customerBLL.updateCustomer(cTemp);
        }
    }
    /**
     * This class defines what the application should do when user clicks on a text field.
     */
    public class TableAction implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            indexTable = customerView.getSelectedRow();
            try {
                String[][] temp = getData(customerBLL.findCustomerAll());
                customerView.setFieldsInfo(customerBLL.findCustomerById(Integer.parseInt(temp[indexTable][0])));
            } catch (IllegalAccessException ex) {
                ex.printStackTrace();
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
    /**
     * This class defines what the application should do when user clicks on a table row.
     */
    public  class TextFieldAction extends FocusAdapter {
        @Override
        public void focusGained(FocusEvent e) {
            customerView.clearFields();
        }

    }
    /**
     * This method returns the columns of the table from database as a String[].
     */
    public String[] getColumns(){
        String [] columns = new String[Customer.class.getDeclaredFields().length];
        int i=0;
        for(Field f : Customer.class.getDeclaredFields()){
            columns[i] = f.getName();
            i++;
        }
        return columns;
    }
    /**
     * This method returns the data of the table in rows and columns in a String[][].
     * @param list
     * @return
     * @throws IllegalAccessException
     */
    public String[][] getData(List<Customer> list) throws  IllegalAccessException{
        String [][] data = new String[list.size()][Customer.class.getDeclaredFields().length];
        int rowI=0;
        for(Customer p : list){
            int colI=0;
            for(Field f : Customer.class.getDeclaredFields()){
                f.setAccessible(true);
                Object value = null;
                value = f.get(p);
                data[rowI][colI] = String.valueOf(value);
                colI++;
            }
            rowI++;
        }
        return data;

    }
}
