package presentation.controller;

import filesaving.FileSavingBill;
import bll.BillBLL;
import bll.ProductBLL;
import model.Bill;
import model.Product;
import presentation.view.BillView;

import java.awt.event.*;
import java.lang.reflect.Field;
import java.util.List;
/**
 * This class is the controller of BillView.
 */
public class BillController {
    private ProductBLL productBLL = null;
    private BillBLL billBLL = null;
    private BillView billView = null;
    /**
     * BillController constructor.
     */
    public BillController(){
        this.billBLL = new BillBLL();
        this.billView = new BillView();
        this.productBLL = new ProductBLL();
        billView.frmOrderManagementSystem.setVisible(true);
        billView.addRefreshListener(new RefreshAction());
        billView.addAddListener(new AddAction());
        billView.addDeleteListener(new DeleteAction());
        billView.addEditListener(new EditAction());
        billView.addTableListener(new TableAction());
        billView.addPrintListener(new PrintAction());
        billView.addTextFieldFocusAdapter(new TextFieldAction());
    }
    /**
     * This class defines what the application should do when user clicks on Refresh button.
     */
    public class RefreshAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            billView.refreshFields();
            try{
                billView.setTableProductsColumns(getData(billBLL.findBillAll()),getColumns());
            } catch (IllegalAccessException ex){
                ex.printStackTrace();
            }
        }
    }
    /**
     * This class defines what the application should do when user clicks on Print button.
     */
    public class PrintAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            FileSavingBill fileSavingBill = new FileSavingBill();
            int billId = billView.getUserOrderIdInput();
            fileSavingBill.getBill(billId);
            try{
                fileSavingBill.saveBillInFile(billId);
            } catch (Exception ex){
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
            int orderId = billView.getUserOrderIdInput();
            int clientId = billView.getUserClientIdInput();
            int productId = billView.getUserProductIdInput();
            int quantity = billView.getUserQuantityInput();
            int cost = billView.getUserCostInput();
            Bill bTemp = new Bill(orderId, clientId,productId,quantity, cost);
            Product pTemp = productBLL.findProductById(productId);
            if(pTemp.getStock() - quantity >= 0){
                billBLL.insertBill(bTemp);
                pTemp.setStock( pTemp.getStock() - quantity);
                productBLL.updateProduct(pTemp);
            } else {
                billView.showMessage("The asked quantity is bigger than our stock!");
            }
        }
    }
    /**
     * This class defines what the application should do when user clicks on Delete button.
     */
    public class DeleteAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int id = billView.getUserOrderIdInput();
            billBLL.deleteBill(id);
        }
    }
    /**
     * This class defines what the application should do when user clicks on Update button.
     */
    public class EditAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int orderId = billView.getUserOrderIdInput();
            int clientId = billView.getUserClientIdInput();
            int productId = billView.getUserProductIdInput();
            int quantity = billView.getUserQuantityInput();
            int cost = billView.getUserCostInput();
            Bill bTemp = new Bill(orderId, clientId,productId,quantity, cost);
            billBLL.updateBill(bTemp);
        }
    }
    /**
     * This class defines what the application should do when user clicks on a table row.
     */
    public class TableAction implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            int indexTable = billView.getSelectedRow();
            //productView.setFieldsInfo(productBLL.findProductById(indexTable));
            try {
                String[][] temp = getData(billBLL.findBillAll());
                billView.setFieldsInfo(billBLL.findBillById(Integer.parseInt(temp[indexTable][0])));
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
     * This class defines what the application should do when user clicks on a text field.
     */
    public  class TextFieldAction extends FocusAdapter {
        @Override
        public void focusGained(FocusEvent e) {
            billView.clearFields();
        }

    }
    /**
     * This method returns the columns of the table from database as a String[].
     */
    public String[] getColumns(){
        String [] columns = new String[Bill.class.getDeclaredFields().length];
        int i=0;
        for(Field f : Bill.class.getDeclaredFields()){
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
    public String[][] getData(List<Bill> list) throws  IllegalAccessException{
        String [][] data = new String[list.size()][Bill.class.getDeclaredFields().length];
        int rowI=0;
        for(Bill p : list){
            int colI=0;
            for(Field f : Bill.class.getDeclaredFields()){
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
