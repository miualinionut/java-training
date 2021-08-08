package clean.code.design_patterns.requirements.Presentation;

import javax.swing.*;

public class ClientGUI extends JFrame{
    private JPanel mainPanel;
    private JButton returnButton;
    private JTable table1;
    private JButton viewButton;
    private JButton searchButton;
    private JTextField nameTextField;
    private JTextField numericValueTextField;
    private JButton addButton;
    private JButton finaliseOrderButton;
    private JButton removeButton;
    private JComboBox greaterSmallerComboBox;
    private JComboBox fieldComboBox;
    private JComboBox orderComboBox;

    /**
     * Instantiates a new Client gui.
     */
    public ClientGUI(){
        add(mainPanel);
        setTitle("Client panel");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000,600);
        setVisible(true);
    }

    public JButton getReturnButton() {
        return returnButton;
    }

    public JTable getTable1() {
        return table1;
    }

    public JButton getViewButton() {
        return viewButton;
    }

    public void setTable1(JTable table1) {
        this.table1 = table1;
    }

    public JButton getSearchButton() {
        return searchButton;
    }

    public JTextField getNameTextField() {
        return nameTextField;
    }

    public JTextField getNumericValueTextField() {
        return numericValueTextField;
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getFinaliseOrderButton() {
        return finaliseOrderButton;
    }

    public JButton getRemoveButton() {
        return removeButton;
    }

    public JComboBox getGreaterSmallerComboBox() {
        return greaterSmallerComboBox;
    }

    public JComboBox getFieldComboBox() {
        return fieldComboBox;
    }

    public JComboBox getOrderComboBox() {
        return orderComboBox;
    }
}
