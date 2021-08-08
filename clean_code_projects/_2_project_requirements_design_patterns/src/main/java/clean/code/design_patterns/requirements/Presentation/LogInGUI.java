package clean.code.design_patterns.requirements.Presentation;

import javax.swing.*;
import java.awt.*;

public class LogInGUI extends JFrame {
    private JTextField textField1;
    private JTextField userTextField;
    private JPasswordField passPasswordField;
    private JPanel mainPanel;
    private JButton logInButton;
    private JButton registerButton;

    public LogInGUI() {
        add(mainPanel);
        setTitle("Log in panel");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public JTextField getUserTextField() {
        return userTextField;
    }

    public JPasswordField getPassPasswordField() {
        return passPasswordField;
    }

    public JButton getLogInButton() {
        return logInButton;
    }

    public JButton getRegisterButton() {
        return registerButton;
    }
}
