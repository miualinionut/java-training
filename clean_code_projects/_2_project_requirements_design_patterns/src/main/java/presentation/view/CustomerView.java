package presentation.view;

import model.Customer;
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
 * CustomerView - class of type view
 * Has the role to construct the GUI of the window that operates on customer table
 */

public class CustomerView {

    public JFrame frmCustomerManagementSystem;
    private JTable tableCustomers;
    private JTextField textFieldId;
    private JTextField txtFieldName;
    private JTextField textFieldAddress;
    private JTextField textFieldEmail;
    private JLabel lblmage;
    private JLabel lblCustomerId;
    private JLabel lblCustomerName;
    private JLabel lblAddress;
    private JLabel lblEmail;
    private JButton btnEdit;
    private JButton btnAdd;
    private JButton btnDelete;
    private JButton btnRefresh;
    private JScrollPane scrollPane;
    private JTextField textFieldAge;
    private JLabel lblAge;

    /**
     * Create the application.
     */
    public CustomerView() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmCustomerManagementSystem = new JFrame();
        frmCustomerManagementSystem.setTitle("Customers Management System");
        frmCustomerManagementSystem.getContentPane().setBackground(Color.DARK_GRAY);
        frmCustomerManagementSystem.setBackground(Color.WHITE);
        frmCustomerManagementSystem.setBounds(100, 100, 770, 500);
        frmCustomerManagementSystem.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmCustomerManagementSystem.getContentPane().setLayout(null);

        tableCustomers = new JTable();
        tableCustomers.setForeground(Color.WHITE);
        tableCustomers.setFont(new Font("Tahoma", Font.PLAIN, 12));
        tableCustomers.setBackground(Color.DARK_GRAY);
        tableCustomers.setGridColor(Color.WHITE);
        scrollPane = new JScrollPane(tableCustomers);
        scrollPane.setBackground(Color.DARK_GRAY);
        scrollPane.setForeground(Color.DARK_GRAY);
        scrollPane.getVerticalScrollBar().setBackground(Color.DARK_GRAY);
        scrollPane.getHorizontalScrollBar().setBackground(Color.DARK_GRAY);
        scrollPane.getVerticalScrollBar().setForeground(Color.DARK_GRAY);
        scrollPane.setBounds(280, 5, 468, 414);
        frmCustomerManagementSystem.getContentPane().add(scrollPane);


        lblCustomerId = new JLabel("ID");
        lblCustomerId.setForeground(Color.WHITE);
        lblCustomerId.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblCustomerId.setBounds(10, 192, 34, 13);
        frmCustomerManagementSystem.getContentPane().add(lblCustomerId);

        lblCustomerName = new JLabel("NAME");
        lblCustomerName.setForeground(Color.WHITE);
        lblCustomerName.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblCustomerName.setBounds(10, 223, 51, 13);
        frmCustomerManagementSystem.getContentPane().add(lblCustomerName);

        lblAddress = new JLabel("ADDRESS");
        lblAddress.setForeground(Color.WHITE);
        lblAddress.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblAddress.setBounds(10, 251, 64, 13);
        frmCustomerManagementSystem.getContentPane().add(lblAddress);

        lblEmail = new JLabel("EMAIL");
        lblEmail.setForeground(Color.WHITE);
        lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblEmail.setBounds(10, 284, 51, 13);
        frmCustomerManagementSystem.getContentPane().add(lblEmail);

        textFieldId = new JTextField();
        textFieldId.setHorizontalAlignment(SwingConstants.CENTER);
        textFieldId.setText("insert the customer id here");
        textFieldId.setBackground(Color.DARK_GRAY);
        textFieldId.setForeground(Color.WHITE);
        textFieldId.setFont(new Font("Tahoma", Font.ITALIC, 12));
        textFieldId.setBounds(71, 189, 182, 19);
        frmCustomerManagementSystem.getContentPane().add(textFieldId);
        textFieldId.setColumns(10);

        txtFieldName = new JTextField();
        txtFieldName.setHorizontalAlignment(SwingConstants.CENTER);
        txtFieldName.setText("insert the customer name here");
        txtFieldName.setForeground(Color.WHITE);
        txtFieldName.setFont(new Font("Tahoma", Font.ITALIC, 12));
        txtFieldName.setColumns(10);
        txtFieldName.setBackground(Color.DARK_GRAY);
        txtFieldName.setBounds(71, 220, 182, 19);
        frmCustomerManagementSystem.getContentPane().add(txtFieldName);

        textFieldAddress = new JTextField();
        textFieldAddress.setText("insert the customer address here");
        textFieldAddress.setHorizontalAlignment(SwingConstants.CENTER);
        textFieldAddress.setForeground(Color.WHITE);
        textFieldAddress.setFont(new Font("Tahoma", Font.ITALIC, 12));
        textFieldAddress.setColumns(10);
        textFieldAddress.setBackground(Color.DARK_GRAY);
        textFieldAddress.setBounds(71, 248, 182, 19);
        frmCustomerManagementSystem.getContentPane().add(textFieldAddress);

        textFieldEmail = new JTextField();
        textFieldEmail.setText("insert the customer email here");
        textFieldEmail.setHorizontalAlignment(SwingConstants.CENTER);
        textFieldEmail.setForeground(Color.WHITE);
        textFieldEmail.setFont(new Font("Tahoma", Font.ITALIC, 12));
        textFieldEmail.setColumns(10);
        textFieldEmail.setBackground(Color.DARK_GRAY);
        textFieldEmail.setBounds(71, 281, 182, 19);
        frmCustomerManagementSystem.getContentPane().add(textFieldEmail);

        btnEdit = new JButton("Edit");
        btnEdit.setBackground(Color.DARK_GRAY);
        btnEdit.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnEdit.setForeground(Color.WHITE);
        btnEdit.setBounds(10, 397, 108, 35);
        frmCustomerManagementSystem.getContentPane().add(btnEdit);

        btnAdd = new JButton("Add");
        btnAdd.setForeground(Color.WHITE);
        btnAdd.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnAdd.setBackground(Color.DARK_GRAY);
        btnAdd.setBounds(10, 352, 108, 35);
        frmCustomerManagementSystem.getContentPane().add(btnAdd);

        btnDelete = new JButton("Delete");
        btnDelete.setForeground(Color.WHITE);
        btnDelete.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnDelete.setBackground(Color.DARK_GRAY);
        btnDelete.setBounds(143, 351, 108, 36);
        frmCustomerManagementSystem.getContentPane().add(btnDelete);

        btnRefresh = new JButton("Refresh");
        btnRefresh.setForeground(Color.WHITE);
        btnRefresh.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnRefresh.setBackground(Color.DARK_GRAY);
        btnRefresh.setBounds(143, 397, 108, 35);
        frmCustomerManagementSystem.getContentPane().add(btnRefresh);



        lblmage = new JLabel("");
        BufferedImage bufferedImage = null;
        lblmage.setBackground(Color.DARK_GRAY);
        lblmage.setBounds(35, 10, 236, 172);
        try {
            bufferedImage = ImageIO.read(new File("C:\\developlement\\workspace\\java-training\\clean_code_projects\\_2_project_requirements_design_patterns\\customer2.png"));
        } catch (IOException e){
            e.printStackTrace();
        }
        Image dimg = bufferedImage.getScaledInstance(lblmage.getWidth()-20, lblmage.getHeight()-20, Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        lblmage.setIcon(imageIcon);

        frmCustomerManagementSystem.getContentPane().add(lblmage);

        lblAge = new JLabel("AGE");
        lblAge.setForeground(Color.WHITE);
        lblAge.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblAge.setBounds(10, 310, 51, 13);
        frmCustomerManagementSystem.getContentPane().add(lblAge);

        textFieldAge = new JTextField();
        textFieldAge.setText("insert the customer age here");
        textFieldAge.setHorizontalAlignment(SwingConstants.CENTER);
        textFieldAge.setForeground(Color.WHITE);
        textFieldAge.setFont(new Font("Tahoma", Font.ITALIC, 12));
        textFieldAge.setColumns(10);
        textFieldAge.setBackground(Color.DARK_GRAY);
        textFieldAge.setBounds(71, 307, 182, 19);
        frmCustomerManagementSystem.getContentPane().add(textFieldAge);
    }

    /**
     * Clear the text fields text.
     */
    public void clearFields(){
        if(txtFieldName.getText().equalsIgnoreCase("insert the customer name here")){
            textFieldEmail.setText("");
            txtFieldName.setText("");
            textFieldId.setText("");
            textFieldAddress.setText("");
            textFieldAge.setText("");
        }

    }

    /**
     * Takes text of text fields to their initial state.
     */
    public void refreshFields(){
        textFieldEmail.setText("insert the customer email here");
        txtFieldName.setText("insert the customer name here");
        textFieldId.setText("insert the customer id here");
        textFieldAddress.setText("insert the customer address here");
        textFieldAge.setText("insert the customer age here");
    }

    /**
     * Set the text of text field based on the parameter of Customer class.
     * @param p
     */
    public void setFieldsInfo(Customer p){
        textFieldEmail.setText(String.valueOf(p.getEmail()));
        textFieldAddress.setText(String.valueOf(p.getAddress()));
        textFieldId.setText(String.valueOf(p.getId()));
        txtFieldName.setText(String.valueOf(p.getName()));
        textFieldAge.setText(String.valueOf(p.getAge()));
    }

    /**
     * Returns the index of the selected row in the JTable.
     * @return
     */
    public int getSelectedRow(){
        return tableCustomers.getSelectedRow();
    }

    /**
     * Construct the JTable with columns from column and data from data.
     * @param data
     * @param column
     */
    public void setTableProductsColumns(String[][] data, String[] column){
        tableCustomers.setModel(new DefaultTableModel(data, column));
    }

    /**
     * Add a Refresh button action listener.
     * @param actionListener
     */
    public void addRefreshListener(ActionListener actionListener){
        btnRefresh.addActionListener(actionListener);
    }

    /**
     * Add an Add button action listener.
     * @param actionListener
     */
    public void addAddListener(ActionListener actionListener){
        btnAdd.addActionListener(actionListener);
    }

    /**
     * Add a Table mouse listener.
     * @param mouseListener
     */
    public void addTableListener(MouseListener mouseListener){
        tableCustomers.addMouseListener(mouseListener);
    }

    /**
     * Add a Delete button action listener.
     * @param actionListener
     */
    public void addDeleteListener(ActionListener actionListener){
        btnDelete.addActionListener(actionListener);
    }

    /**
     * Add an Edit button action listener.
     * @param actionListener
     */
    public void addEditListener(ActionListener actionListener){
        btnEdit.addActionListener(actionListener);
    }

    /**
     * Add a TextField focus adapter for all text field.
     * @param focusAdapter
     */
    public void addTextFieldFocusAdapter(FocusAdapter focusAdapter) {
        textFieldId.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                clearFields();
            }
        });
        textFieldAddress.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                clearFields();
            }
        });
        txtFieldName.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                clearFields();
            }
        });
        textFieldAge.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                clearFields();
            }
        });
        textFieldEmail.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                clearFields();
            }
        });

    };

    /**
     * Returns the value of id chosen by user.
     * @return
     */
    public int getUserIdInput(){
        int a=0;
        try{
            a = Integer.parseInt(this.textFieldId.getText());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this.frmCustomerManagementSystem, "The ID value is not valid!");
        }
        return a;
    }

    /**
     * Get the user input on address.
     * @return
     */
    public String getUserAddressInput(){
        String a=null;
        try{
            a = this.textFieldAddress.getText();
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this.frmCustomerManagementSystem, "The address value is not valid!");
        }
        return a;
    }

    /**
     * Get the user input on email text field.
     * @return
     */
    public String getUserEmailInput(){
        String a=null;
        try{
            a = this.textFieldEmail.getText();
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this.frmCustomerManagementSystem, "The email value is not valid!");
        }
        return a;
    }

    /**
     * Get the user input on name text field.
     * @return
     */
    public String getUserNameInput(){
        return this.txtFieldName.getText();
    }

    /**
     * Get the user input on age text field.
     * @return
     */
    public int getUserAgeInput(){
        int a = 0;
        try{
            a = Integer.parseInt(this.textFieldAge.getText());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this.frmCustomerManagementSystem, "The age value is not valid!");
        }
        return a;
    }
}
