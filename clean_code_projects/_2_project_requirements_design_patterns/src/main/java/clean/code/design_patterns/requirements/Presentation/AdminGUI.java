package clean.code.design_patterns.requirements.Presentation;

import clean.code.design_patterns.requirements.Data.Serialiser;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AdminGUI extends JFrame {

    private JPanel mainPanel;
    private JButton returnButton;
    private JTable table1;
    private JButton viewButton;
    private JButton importButton;
    private JButton addButton;
    private JButton editButton;
    private JButton generateReportsButton;
    private JTextField ratingTextField;
    private JTextField nameTextField;
    private JTextField caloriesTextField;
    private JTextField proteinTextField;
    private JTextField fatTextField;
    private JTextField sodiumTextField;
    private JTextField priceTextField;
    private JTextField fileNameTextField;
    private JButton deleteButton;
    private JButton createNewProductButton;
    private JButton addButton1;
    private JButton removeButton;
    private JComboBox comboBox1;
    private JTextField newNameTextField;
    private JTextField startHTextField;
    private JTextField endHTextField;
    private JTextField productThreshTextField;
    private JTextField clientThreshTextField;
    private JTextField orderThreshTextField;

    public AdminGUI() {
        add(mainPanel);
        setTitle("Admin panel");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1400,600);
        setVisible(true);
    }

    public JButton getReturnButton() {
        return returnButton;
    }

    public JTable getTable1() {
        return table1;
    }

    public void setTable1(JTable table1) {
        this.table1 = table1;
    }

    public JButton getViewButton() {
        return viewButton;
    }

    public JButton getImportButton() {
        return importButton;
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getEditButton() {
        return editButton;
    }

    public JButton getGenerateReportsButton() {
        return generateReportsButton;
    }

    public JTextField getRatingTextField() {
        return ratingTextField;
    }

    public JTextField getNameTextField() {
        return nameTextField;
    }

    public JTextField getCaloriesTextField() {
        return caloriesTextField;
    }

    public JTextField getProteinTextField() {
        return proteinTextField;
    }

    public JTextField getFatTextField() {
        return fatTextField;
    }

    public JTextField getSodiumTextField() {
        return sodiumTextField;
    }

    public JTextField getPriceTextField() {
        return priceTextField;
    }

    public JTextField getFileNameTextField() {
        return fileNameTextField;
    }

    public JButton getDeleteButton() {
        return deleteButton;
    }

    public JButton getCreateNewProductButton() {
        return createNewProductButton;
    }

    public JButton getAddButton1() {
        return addButton1;
    }

    public JButton getRemoveButton() {
        return removeButton;
    }

    public JComboBox getComboBox1() {
        return comboBox1;
    }

    public JTextField getNewNameTextField() {
        return newNameTextField;
    }

    public JTextField getStartHTextField() {
        return startHTextField;
    }

    public JTextField getEndHTextField() {
        return endHTextField;
    }

    public JTextField getProductThreshTextField() {
        return productThreshTextField;
    }

    public JTextField getClientThreshTextField() {
        return clientThreshTextField;
    }

    public JTextField getOrderThreshTextField() {
        return orderThreshTextField;
    }
}
