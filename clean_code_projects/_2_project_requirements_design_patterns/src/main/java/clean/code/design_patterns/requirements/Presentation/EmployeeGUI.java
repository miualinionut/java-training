package clean.code.design_patterns.requirements.Presentation;

import java.util.Observable;
import java.util.Observer;
import javax.swing.*;

public class EmployeeGUI extends JFrame  {


    private JPanel mainPanel;
    private JTextField textField1;
    private JButton returnButton;
    private JButton clearNotificationButton;

    public void update(Observable o, Object arg) {

    }

    public EmployeeGUI(){
        add(mainPanel);
        setTitle("Employee panel");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,600);
        setVisible(true);
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public JButton getReturnButton() {
        return returnButton;
    }

    public JButton getClearNotificationButton() {
        return clearNotificationButton;
    }
}
