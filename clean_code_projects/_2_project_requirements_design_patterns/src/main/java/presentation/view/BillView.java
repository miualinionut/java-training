package presentation.view;

import model.Bill;
import model.Product;

import java.awt.EventQueue;
import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * BillView - class of type view
 * Has the role to construct the GUI of the window that operates on bill table
 */
public class BillView {

    public JFrame frmOrderManagementSystem;
    private JTable tableBills;
    private JTextField textFieldOrderId;
    private JTextField txtFieldClientId;
    private JTextField textFieldProductId;
    private JTextField textFieldQuantity;
    private JLabel lblmage;
    private JLabel lblOrderId;
    private JLabel lblClientID;
    private JLabel lblProductID;
    private JLabel lblQuantity;
    private JButton btnEdit;
    private JButton btnAdd;
    private JButton btnDelete;
    private JButton btnRefresh;
    private JScrollPane scrollPane;
    private JTextField textFieldCost;
    private JButton btnPrint;

    /**
     * Create the application.
     */
    public BillView() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmOrderManagementSystem = new JFrame();
        frmOrderManagementSystem.setTitle("Orders Management System");
        frmOrderManagementSystem.getContentPane().setBackground(Color.DARK_GRAY);
        frmOrderManagementSystem.setBackground(Color.WHITE);
        frmOrderManagementSystem.setBounds(100, 100, 770, 540);
        frmOrderManagementSystem.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmOrderManagementSystem.getContentPane().setLayout(null);

        tableBills = new JTable();
        tableBills.setForeground(Color.WHITE);
        tableBills.setFont(new Font("Tahoma", Font.PLAIN, 12));
        tableBills.setBackground(Color.DARK_GRAY);
        tableBills.setGridColor(Color.WHITE);
        scrollPane = new JScrollPane(tableBills);
        scrollPane.setBackground(Color.DARK_GRAY);
        scrollPane.setForeground(Color.DARK_GRAY);
        scrollPane.getVerticalScrollBar().setBackground(Color.DARK_GRAY);
        scrollPane.getHorizontalScrollBar().setBackground(Color.DARK_GRAY);
        scrollPane.getVerticalScrollBar().setForeground(Color.DARK_GRAY);
        scrollPane.setBounds(280, 5, 468, 414);
        frmOrderManagementSystem.getContentPane().add(scrollPane);


        lblOrderId = new JLabel("OrderID");
        lblOrderId.setForeground(Color.WHITE);
        lblOrderId.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblOrderId.setBounds(10, 192, 51, 13);
        frmOrderManagementSystem.getContentPane().add(lblOrderId);

        lblClientID = new JLabel("ClientID");
        lblClientID.setForeground(Color.WHITE);
        lblClientID.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblClientID.setBounds(10, 223, 51, 13);
        frmOrderManagementSystem.getContentPane().add(lblClientID);

        lblProductID = new JLabel("ProductID");
        lblProductID.setForeground(Color.WHITE);
        lblProductID.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblProductID.setBounds(10, 251, 64, 13);
        frmOrderManagementSystem.getContentPane().add(lblProductID);

        lblQuantity = new JLabel("QUANTITY");
        lblQuantity.setForeground(Color.WHITE);
        lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblQuantity.setBounds(10, 284, 77, 13);
        frmOrderManagementSystem.getContentPane().add(lblQuantity);

        textFieldOrderId = new JTextField();
        textFieldOrderId.setHorizontalAlignment(SwingConstants.CENTER);
        textFieldOrderId.setText("insert the order id here");
        textFieldOrderId.setBackground(Color.DARK_GRAY);
        textFieldOrderId.setForeground(Color.WHITE);
        textFieldOrderId.setFont(new Font("Tahoma", Font.ITALIC, 12));
        textFieldOrderId.setBounds(84, 192, 182, 19);
        frmOrderManagementSystem.getContentPane().add(textFieldOrderId);
        textFieldOrderId.setColumns(10);

        txtFieldClientId = new JTextField();
        txtFieldClientId.setHorizontalAlignment(SwingConstants.CENTER);
        txtFieldClientId.setText("insert the client id here");
        txtFieldClientId.setForeground(Color.WHITE);
        txtFieldClientId.setFont(new Font("Tahoma", Font.ITALIC, 12));
        txtFieldClientId.setColumns(10);
        txtFieldClientId.setBackground(Color.DARK_GRAY);
        txtFieldClientId.setBounds(84, 223, 182, 19);
        frmOrderManagementSystem.getContentPane().add(txtFieldClientId);

        textFieldProductId = new JTextField();
        textFieldProductId.setText("insert the product id here");
        textFieldProductId.setHorizontalAlignment(SwingConstants.CENTER);
        textFieldProductId.setForeground(Color.WHITE);
        textFieldProductId.setFont(new Font("Tahoma", Font.ITALIC, 12));
        textFieldProductId.setColumns(10);
        textFieldProductId.setBackground(Color.DARK_GRAY);
        textFieldProductId.setBounds(84, 251, 182, 19);
        frmOrderManagementSystem.getContentPane().add(textFieldProductId);

        textFieldQuantity = new JTextField();
        textFieldQuantity.setText("insert the product quantity here");
        textFieldQuantity.setHorizontalAlignment(SwingConstants.CENTER);
        textFieldQuantity.setForeground(Color.WHITE);
        textFieldQuantity.setFont(new Font("Tahoma", Font.ITALIC, 12));
        textFieldQuantity.setColumns(10);
        textFieldQuantity.setBackground(Color.DARK_GRAY);
        textFieldQuantity.setBounds(84, 284, 182, 19);
        frmOrderManagementSystem.getContentPane().add(textFieldQuantity);

        btnEdit = new JButton("Edit");
        btnEdit.setBackground(Color.DARK_GRAY);
        btnEdit.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnEdit.setForeground(Color.WHITE);
        btnEdit.setBounds(10, 397, 108, 35);
        frmOrderManagementSystem.getContentPane().add(btnEdit);

        btnAdd = new JButton("Add");
        btnAdd.setForeground(Color.WHITE);
        btnAdd.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnAdd.setBackground(Color.DARK_GRAY);
        btnAdd.setBounds(10, 352, 108, 35);
        frmOrderManagementSystem.getContentPane().add(btnAdd);

        btnDelete = new JButton("Delete");
        btnDelete.setForeground(Color.WHITE);
        btnDelete.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnDelete.setBackground(Color.DARK_GRAY);
        btnDelete.setBounds(158, 351, 108, 36);
        frmOrderManagementSystem.getContentPane().add(btnDelete);

        btnRefresh = new JButton("Refresh");
        btnRefresh.setForeground(Color.WHITE);
        btnRefresh.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnRefresh.setBackground(Color.DARK_GRAY);
        btnRefresh.setBounds(158, 397, 108, 35);
        frmOrderManagementSystem.getContentPane().add(btnRefresh);

        btnPrint = new JButton("Print");
        btnPrint.setForeground(Color.WHITE);
        btnPrint.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnPrint.setBackground(Color.DARK_GRAY);
        btnPrint.setBounds(54, 440, 158, 35);
        frmOrderManagementSystem.getContentPane().add(btnPrint);

        lblmage = new JLabel("");
        //lblmage.setIcon(new ImageIcon("D:\\diverse\\AN 2\\SEM2\\TP\\TEMA3\\producticon.png"));
        BufferedImage bufferedImage = null;
        lblmage.setBackground(Color.DARK_GRAY);
        lblmage.setBounds(30, 10, 236, 172);
        try {
            bufferedImage = ImageIO.read(new File("C:\\developlement\\workspace\\java-training\\clean_code_projects\\_2_project_requirements_design_patterns\\invoice.png"));
        } catch (IOException e){
            e.printStackTrace();
        }
        Image dimg = bufferedImage.getScaledInstance(lblmage.getWidth()-20, lblmage.getHeight()-20, Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        lblmage.setIcon(imageIcon);

        frmOrderManagementSystem.getContentPane().add(lblmage);

        JLabel lblCost = new JLabel("COST");
        lblCost.setForeground(Color.WHITE);
        lblCost.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblCost.setBounds(10, 310, 51, 13);
        frmOrderManagementSystem.getContentPane().add(lblCost);

        textFieldCost = new JTextField();
        textFieldCost.setText("insert the order cost here");
        textFieldCost.setHorizontalAlignment(SwingConstants.CENTER);
        textFieldCost.setForeground(Color.WHITE);
        textFieldCost.setFont(new Font("Tahoma", Font.ITALIC, 12));
        textFieldCost.setColumns(10);
        textFieldCost.setBackground(Color.DARK_GRAY);
        textFieldCost.setBounds(84, 310, 182, 19);
        frmOrderManagementSystem.getContentPane().add(textFieldCost);


    }

    /**
     * Method that clears the text fields.
     */
    public void clearFields(){
        if(textFieldOrderId.getText().equalsIgnoreCase("insert the order id here")){
            textFieldQuantity.setText("");
            txtFieldClientId.setText("");
            textFieldOrderId.setText("");
            textFieldProductId.setText("");
            textFieldCost.setText("");
        }

    }

    /**
     * Method that takes the text of text fields to their initial state.
     */
    public void refreshFields(){
        textFieldQuantity.setText("insert the product quantity here");
        txtFieldClientId.setText("insert the customer id here");
        textFieldOrderId.setText("insert the order id here");
        textFieldProductId.setText("insert the product id here");
        textFieldCost.setText("insert the order cost here");
    }

    /**
     * Method that sets the text field text based of the properties of the Bill object.
     * @param p
     */
    public void setFieldsInfo(Bill p){
        textFieldQuantity.setText(String.valueOf(p.getQuantity()));
        textFieldProductId.setText(String.valueOf(p.getProductId()));
        textFieldOrderId.setText(String.valueOf(p.getOrderId()));
        txtFieldClientId.setText(String.valueOf(p.getClientId()));
        textFieldCost.setText(String.valueOf(p.getCost()));
    }

    /**
     * Method that return the index of the current selected row.
     * @return
     */
    public int getSelectedRow(){
        return tableBills.getSelectedRow();
    }

    /**
     * Method that sets the data of the table to data and its columns to column array
     * @param data
     * @param column
     */
    public void setTableProductsColumns(String[][] data, String[] column){
        tableBills.setModel(new DefaultTableModel(data, column));
    }


    /**
     * Method that adds an Refresh button action listener.
     * @param actionListener
     */
    public void addRefreshListener(ActionListener actionListener){
        btnRefresh.addActionListener(actionListener);
    }

    /**
     * Method that adds an Add button action listener.
     * @param actionListener
     */
    public void addAddListener(ActionListener actionListener){
        btnAdd.addActionListener(actionListener);
    }

    /**
     * Method that adds a Table mouse click listener.
     * @param mouseListener
     */
    public void addTableListener(MouseListener mouseListener){
        tableBills.addMouseListener(mouseListener);
    }

    /**
     * Method that adds a Delete button action listener.
     * @param actionListener
     */
    public void addDeleteListener(ActionListener actionListener){
        btnDelete.addActionListener(actionListener);
    }

    /**
     * Method that adds an Edit button action listener.
     * @param actionListener
     */
    public void addEditListener(ActionListener actionListener){
        btnEdit.addActionListener(actionListener);
    }

    /**
     * Method that adds a Textfield focus adapter.
     * @param focusAdapter
     */

    public void addTextFieldFocusAdapter(FocusAdapter focusAdapter) {
        textFieldQuantity.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                clearFields();
            }
        });
        textFieldCost.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                clearFields();
            }
        });
        textFieldOrderId.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                clearFields();
            }
        });
        txtFieldClientId.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                clearFields();
            }
        });
        textFieldProductId.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                clearFields();
            }
        });
    };

    /**
     * Method that adds a Print button action listener.
     * @param actionListener
     */
    public void addPrintListener(ActionListener actionListener){
        btnPrint.addActionListener(actionListener);
    }

    /**
     * Method that creates a JOptionPane in order to display a message.
     * @param s
     */
    public void showMessage(String s){
        JOptionPane.showMessageDialog(frmOrderManagementSystem, s);
    }

    /**
     * Get the user input on orderId text field.
     * @return
     */
    public int getUserOrderIdInput(){
        int a=0;
        try{
            a = Integer.parseInt(this.textFieldOrderId.getText());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this.frmOrderManagementSystem, "The order id value is not valid!");
        }
        return a;
    }

    /**
     * Get the user input on productId text field.
     * @return
     */
    public int getUserProductIdInput(){
        int a=0;
        try{
            a = Integer.parseInt(this.textFieldProductId.getText());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this.frmOrderManagementSystem, "The product id value is not valid!");
        }
        return a;
    }

    /**
     * Get the user input on quantity text field.
     * @return
     */
    public int getUserQuantityInput(){
        int a=0;
        try{
            a = Integer.parseInt(this.textFieldQuantity.getText());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this.frmOrderManagementSystem, "The quantity value is not valid!");
        }
        return a;
    }

    /**
     * Get the user input on client id text field.
     * @return
     */
    public int getUserClientIdInput(){
        int a=0;
        try{
            a = Integer.parseInt(this.txtFieldClientId.getText());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this.frmOrderManagementSystem, "The client id value is not valid!");
        }
        return a;
    }

    /**
     * Get the user input on cost text field.
     * @return
     */
    public int getUserCostInput(){
        int a=0;
        try{
            a = Integer.parseInt(this.textFieldCost.getText());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this.frmOrderManagementSystem, "The cost value is not valid!");
        }
        return a;
    }
}
