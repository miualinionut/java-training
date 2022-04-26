package presentation.view;

import model.Product;

import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
/**
 * ProductView - class of type view
 * Has the role to construct the GUI of the window that operates on product table
 */
public class ProductView {

    public JFrame frmProductManagementSystem;
    private JTable tableProducts;
    private JTextField textFieldId;
    private JTextField txtFieldName;
    private JTextField textFieldPrice;
    private JTextField txtFieldStock;
    private JLabel lblmage;
    private JLabel lblProductId;
    private JLabel lblProductName;
    private JLabel lblPrice;
    private JLabel lblStock;
    private JButton btnEdit;
    private JButton btnAdd;
    private JButton btnDelete;
    private JButton btnRefresh;
    private JScrollPane scrollPane;

    /**
     * Create the application.
     */
    public ProductView() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmProductManagementSystem = new JFrame();
        frmProductManagementSystem.setTitle("Product Management System");
        frmProductManagementSystem.getContentPane().setBackground(Color.DARK_GRAY);
        frmProductManagementSystem.setBackground(Color.WHITE);
        frmProductManagementSystem.setBounds(100, 100, 770, 500);
        frmProductManagementSystem.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmProductManagementSystem.getContentPane().setLayout(null);

        tableProducts = new JTable();
        tableProducts.setForeground(Color.WHITE);
        tableProducts.setFont(new Font("Tahoma", Font.PLAIN, 12));
        tableProducts.setBackground(Color.DARK_GRAY);
        tableProducts.setGridColor(Color.WHITE);
        scrollPane = new JScrollPane(tableProducts);
        scrollPane.setBackground(Color.DARK_GRAY);
        scrollPane.setForeground(Color.DARK_GRAY);
        scrollPane.getVerticalScrollBar().setBackground(Color.DARK_GRAY);
        scrollPane.getHorizontalScrollBar().setBackground(Color.DARK_GRAY);
        scrollPane.getVerticalScrollBar().setForeground(Color.DARK_GRAY);
        scrollPane.setBounds(280, 5, 468, 414);
        frmProductManagementSystem.add(scrollPane);


        lblProductId = new JLabel("ID");
        lblProductId.setForeground(Color.WHITE);
        lblProductId.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblProductId.setBounds(10, 223, 34, 13);
        frmProductManagementSystem.getContentPane().add(lblProductId);

        lblProductName = new JLabel("NAME");
        lblProductName.setForeground(Color.WHITE);
        lblProductName.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblProductName.setBounds(10, 254, 51, 13);
        frmProductManagementSystem.getContentPane().add(lblProductName);

        lblPrice = new JLabel("PRICE");
        lblPrice.setForeground(Color.WHITE);
        lblPrice.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice.setBounds(10, 283, 51, 13);
        frmProductManagementSystem.getContentPane().add(lblPrice);

        lblStock = new JLabel("STOCK");
        lblStock.setForeground(Color.WHITE);
        lblStock.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblStock.setBounds(10, 315, 51, 13);
        frmProductManagementSystem.getContentPane().add(lblStock);

        textFieldId = new JTextField();
        textFieldId.setHorizontalAlignment(SwingConstants.CENTER);
        textFieldId.setText("insert the product id here");
        textFieldId.setBackground(Color.DARK_GRAY);
        textFieldId.setForeground(Color.WHITE);
        textFieldId.setFont(new Font("Tahoma", Font.ITALIC, 12));
        textFieldId.setBounds(54, 221, 182, 19);
        frmProductManagementSystem.getContentPane().add(textFieldId);
        textFieldId.setColumns(10);

        txtFieldName = new JTextField();
        txtFieldName.setHorizontalAlignment(SwingConstants.CENTER);
        txtFieldName.setText("insert the product name here");
        txtFieldName.setForeground(Color.WHITE);
        txtFieldName.setFont(new Font("Tahoma", Font.ITALIC, 12));
        txtFieldName.setColumns(10);
        txtFieldName.setBackground(Color.DARK_GRAY);
        txtFieldName.setBounds(54, 252, 182, 19);
        frmProductManagementSystem.getContentPane().add(txtFieldName);

        textFieldPrice = new JTextField();
        textFieldPrice.setText("insert the product price here");
        textFieldPrice.setHorizontalAlignment(SwingConstants.CENTER);
        textFieldPrice.setForeground(Color.WHITE);
        textFieldPrice.setFont(new Font("Tahoma", Font.ITALIC, 12));
        textFieldPrice.setColumns(10);
        textFieldPrice.setBackground(Color.DARK_GRAY);
        textFieldPrice.setBounds(54, 280, 182, 19);
        frmProductManagementSystem.getContentPane().add(textFieldPrice);

        txtFieldStock = new JTextField();
        txtFieldStock.setText("insert the product stock here");
        txtFieldStock.setHorizontalAlignment(SwingConstants.CENTER);
        txtFieldStock.setForeground(Color.WHITE);
        txtFieldStock.setFont(new Font("Tahoma", Font.ITALIC, 12));
        txtFieldStock.setColumns(10);
        txtFieldStock.setBackground(Color.DARK_GRAY);
        txtFieldStock.setBounds(54, 313, 182, 19);
        frmProductManagementSystem.getContentPane().add(txtFieldStock);

        btnEdit = new JButton("Edit");
        btnEdit.setBackground(Color.DARK_GRAY);
        btnEdit.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnEdit.setForeground(Color.WHITE);
        btnEdit.setBounds(10, 397, 108, 35);
        frmProductManagementSystem.getContentPane().add(btnEdit);

        btnAdd = new JButton("Add");
        btnAdd.setForeground(Color.WHITE);
        btnAdd.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnAdd.setBackground(Color.DARK_GRAY);
        btnAdd.setBounds(10, 352, 108, 35);
        frmProductManagementSystem.getContentPane().add(btnAdd);

        btnDelete = new JButton("Delete");
        btnDelete.setForeground(Color.WHITE);
        btnDelete.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnDelete.setBackground(Color.DARK_GRAY);
        btnDelete.setBounds(128, 351, 108, 36);
        frmProductManagementSystem.getContentPane().add(btnDelete);

        btnRefresh = new JButton("Refresh");
        btnRefresh.setForeground(Color.WHITE);
        btnRefresh.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnRefresh.setBackground(Color.DARK_GRAY);
        btnRefresh.setBounds(128, 397, 108, 35);
        frmProductManagementSystem.getContentPane().add(btnRefresh);



        lblmage = new JLabel("");
        BufferedImage bufferedImage = null;
        lblmage.setBackground(Color.DARK_GRAY);
        lblmage.setBounds(15, 5, 236, 220);
        try {
            bufferedImage = ImageIO.read(new File("C:\\developlement\\workspace\\java-training\\clean_code_projects\\_2_project_requirements_design_patterns\\3464943.png"));
        } catch (IOException e){
            e.printStackTrace();
        }
        Image dimg = bufferedImage.getScaledInstance(lblmage.getWidth()-20, lblmage.getHeight()-20, Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        lblmage.setIcon(imageIcon);

        frmProductManagementSystem.getContentPane().add(lblmage);
    }

    /**
     * Set text of text fields to empty strings.
     */
    public void clearFields(){
        if(txtFieldName.getText().equalsIgnoreCase( "insert the product name here")){
            txtFieldStock.setText("");
            txtFieldName.setText("");
            textFieldId.setText("");
            textFieldPrice.setText("");
        }
    }

    /**
     * Set the text of text field to their initial state.
     */
    public void refreshFields(){
        txtFieldStock.setText("insert the product stock here");
        txtFieldName.setText("insert the product name here");
        textFieldId.setText("insert the product id here");
        textFieldPrice.setText("insert the product price here");
    }

    /**
     * Set the text of text field based on the parameters of Product class object.
     * @param p
     */
    public void setFieldsInfo(Product p){
        txtFieldStock.setText(String.valueOf(p.getStock()));
        textFieldPrice.setText(String.valueOf(p.getPrice()));
        textFieldId.setText(String.valueOf(p.getId()));
        txtFieldName.setText(String.valueOf(p.getName()));
    }

    /**
     * Returns the index of the selected row in the JTable.
     * @return
     */
    public int getSelectedRow(){
        return tableProducts.getSelectedRow();
    }

    /**
     * Construct the JTable data and columns based on parameters.
     * @param data
     * @param column
     */
    public void setTableProductsColumns(String[][] data, String[] column){
        tableProducts.setModel(new DefaultTableModel(data, column));
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
        tableProducts.addMouseListener(mouseListener);
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
     * Add a TextField focus adapter of all text fields.
     * @param focusAdapter
     */
    public void addTextFieldFocusAdapter(FocusAdapter focusAdapter) {
        textFieldId.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                clearFields();
            }
        });
        textFieldPrice.addFocusListener(new FocusAdapter() {
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
        txtFieldStock.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
               clearFields();
            }
        });
    };

    /**
     * Get the user input on id.
     * @return
     */
    public int getUserIdInput(){
        int a=0;
        try{
            a = Integer.parseInt(this.textFieldId.getText());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this.frmProductManagementSystem, "The ID value is not valid!");
        }
        return a;
    }

    /**
     * Get the user input on price.
     * @return
     */
    public int getUserPriceInput(){
        int a=0;
        try{
            a = Integer.parseInt(this.textFieldPrice.getText());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this.frmProductManagementSystem, "The price value is not valid!");
        }
        return a;
    }

    /**
     * Get the user input on stock.
     * @return
     */
    public int getUserStockInput(){
        int a=0;
        try{
            a = Integer.parseInt(this.txtFieldStock.getText());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this.frmProductManagementSystem, "The stock value is not valid!");
        }
        return a;
    }

    /**
     * Get user input on name.
     * @return
     */
    public String getUserNameInput(){
        return this.txtFieldName.getText();
    }
}
