package clean.code.design_patterns.requirements.GUI;

import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JPanel panel=new JPanel();
        frame.add(panel);

        panel.setLayout(null);

        JLabel label=new JLabel("User");
        label.setBounds(10, 20,80, 25);
        panel.add(label);

        JTextField userText=new JTextField();
        userText.setBounds(10, 20,80, 25);
        panel.add(userText);

        frame.setVisible(true);

    }
}
