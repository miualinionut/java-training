package presentation.view;

import model.Product;

import java.awt.EventQueue;
import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * MainView - class of type view
 * It creates the main GUI - the first interface of the application and the main one
 * It has 3 buttons that starts the other parts of the application.
 */
public class MainView {

    public JFrame frmWareHouseSystem;
    private JLabel lblmage;
    private JButton btnProductManagement;
    private JButton btnCustomerManagement;
    private JButton btnOrdersManagement;
    private JLabel lblWelcome;
    private JLabel lblWelcomeV2;

    /**
     * Create the application.
     */
    public MainView() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmWareHouseSystem = new JFrame();
        frmWareHouseSystem.setTitle("Warehouse System");
        frmWareHouseSystem.getContentPane().setBackground(Color.DARK_GRAY);
        frmWareHouseSystem.setBackground(Color.WHITE);
        frmWareHouseSystem.setBounds(100, 100, 770, 500);
        frmWareHouseSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmWareHouseSystem.getContentPane().setLayout(null);

        btnProductManagement = new JButton("Products Management");
        btnProductManagement.setBackground(Color.DARK_GRAY);
        btnProductManagement.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnProductManagement.setForeground(Color.WHITE);
        btnProductManagement.setBounds(10, 289, 201, 60);
        frmWareHouseSystem.getContentPane().add(btnProductManagement);

        btnCustomerManagement = new JButton("Customers Management");
        btnCustomerManagement.setForeground(Color.WHITE);
        btnCustomerManagement.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnCustomerManagement.setBackground(Color.DARK_GRAY);
        btnCustomerManagement.setBounds(10, 121, 201, 60);
        frmWareHouseSystem.getContentPane().add(btnCustomerManagement);

        btnOrdersManagement = new JButton("Orders Management");
        btnOrdersManagement.setForeground(Color.WHITE);
        btnOrdersManagement.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnOrdersManagement.setBackground(Color.DARK_GRAY);
        btnOrdersManagement.setBounds(10, 209, 201, 60);
        frmWareHouseSystem.getContentPane().add(btnOrdersManagement);



        lblmage = new JLabel("");
        BufferedImage bufferedImage = null;
        lblmage.setBackground(Color.DARK_GRAY);
        lblmage.setBounds(330, 134, 377, 259);
        try {
            bufferedImage = ImageIO.read(new File("C:\\developlement\\workspace\\java-training\\clean_code_projects\\_2_project_requirements_design_patterns\\main.png"));
        } catch (IOException e){
            e.printStackTrace();
        }
        Image dimg = bufferedImage.getScaledInstance(lblmage.getWidth()-20, lblmage.getHeight()-20, Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        lblmage.setIcon(imageIcon);

        frmWareHouseSystem.getContentPane().add(lblmage);

        lblWelcome = new JLabel("Welcome to our warehouse database!");
        lblWelcome.setForeground(Color.WHITE);
        lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblWelcome.setBounds(319, 41, 354, 42);
        frmWareHouseSystem.getContentPane().add(lblWelcome);

        lblWelcomeV2 = new JLabel("Feel free to use whatever you want!");
        lblWelcomeV2.setForeground(Color.WHITE);
        lblWelcomeV2.setFont(new Font("Tahoma", Font.ITALIC, 16));
        lblWelcomeV2.setBounds(362, 67, 258, 42);
        frmWareHouseSystem.getContentPane().add(lblWelcomeV2);
    }

    /**
     * Add an order management button action listener.
     * @param actionListener
     */
    public void addOrdersManagementListener(ActionListener actionListener){
        btnOrdersManagement.addActionListener(actionListener);
    }

    /**
     * Adds a customer management button action listener
     * @param actionListener
     */
    public void addCustomerManagementListener(ActionListener actionListener){
        btnCustomerManagement.addActionListener(actionListener);
    }

    /**
     * Adds a product management button action listener.
     * @param actionListener
     */
    public void addProductManagementListener(ActionListener actionListener){
        btnProductManagement.addActionListener(actionListener);
    }

}
