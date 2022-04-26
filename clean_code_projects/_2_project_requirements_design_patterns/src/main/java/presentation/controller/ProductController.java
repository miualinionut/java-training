package presentation.controller;

import bll.ProductBLL;
import dao.ProductDAO;
import model.Product;
import presentation.view.ProductView;

import javax.sound.sampled.Port;
import javax.swing.*;
import java.awt.event.*;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

/**
 * This class is the controller of ProductView.
 */
public class ProductController {
    private ProductBLL productBLL = null;
    private ProductView productView = null;
    private int indexTable;

    /**
     * ProductController constructor.
     */
    public ProductController(){
        this.productView = new ProductView();
        this.productBLL = new ProductBLL();
        productView.frmProductManagementSystem.setVisible(true);
        productView.addRefreshListener(new RefreshAction());
        productView.addAddListener(new AddAction());
        productView.addDeleteListener(new DeleteAction());
        productView.addEditListener(new EditAction());
        productView.addTableListener(new TableAction());
        productView.addTextFieldFocusAdapter(new TextFieldAction());
    }

    /**
     * This class defines what the application should do when user clicks on Refresh button.
     */
    public class RefreshAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            productView.refreshFields();
            try{
                productView.setTableProductsColumns(getData(productBLL.findProductAll()),getColumns());
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
            String name = productView.getUserNameInput();
            int price = productView.getUserPriceInput();
            int stock = productView.getUserStockInput();
            Product pTemp = new Product(name, price, stock);
            productBLL.insertProduct(pTemp);
        }
    }
    /**
     * This class defines what the application should do when user clicks on Delete button.
     */
    public class DeleteAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int id = productView.getUserIdInput();
            productBLL.deleteProduct(id);
        }
    }
    /**
     * This class defines what the application should do when user clicks on Update button.
     */
    public class EditAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = productView.getUserNameInput();
            int id = productView.getUserIdInput();
            int price = productView.getUserPriceInput();
            int stock = productView.getUserStockInput();
            Product pTemp = new Product(id, name, price, stock);
            productBLL.updateProduct(pTemp);
        }
    }
    /**
     * This class defines what the application should do when user clicks on a text field.
     */
    public  class TextFieldAction extends FocusAdapter {
        @Override
        public void focusGained(FocusEvent e) {
            productView.clearFields();
        }

    }
    /**
     * This class defines what the application should do when user clicks on a table row.
     */
    public class TableAction implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            indexTable = productView.getSelectedRow();
            try {
                String[][] temp = getData(productBLL.findProductAll());
                productView.setFieldsInfo(productBLL.findProductById(Integer.parseInt(temp[indexTable][0])));
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
     * This method returns the columns of the table from database as a String[].
     */
    public String[] getColumns(){
        String [] columns = new String[Product.class.getDeclaredFields().length];
        int i=0;
        for(Field f : Product.class.getDeclaredFields()){
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
    public String[][] getData(List<Product> list) throws  IllegalAccessException{
        String [][] data = new String[list.size()][Product.class.getDeclaredFields().length];
        int rowI=0;
        for(Product p : list){
            int colI=0;
            for(Field f : Product.class.getDeclaredFields()){
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
