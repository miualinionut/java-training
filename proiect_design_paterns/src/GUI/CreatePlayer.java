package GUI;

import Model.Nationality;
import Model.Player;
import Model.Position;


import javax.swing.*;
import java.awt.*;


public class CreatePlayer extends JFrame {

    private Player player; // Model

    public CreatePlayer() {



        JLabel nameLabel = new JLabel("Enter the name of you Player");
        nameLabel.setBounds(800, 100, 190, 40);
        nameLabel.setBackground(Color.GREEN);
        nameLabel.setOpaque(true);

        JLabel positionField = new JLabel("Enter the position of your Player");
        positionField.setBounds(800, 200, 190, 40);
        positionField.setBackground(Color.GREEN);
        positionField.setOpaque(true);

        JLabel nationalField = new JLabel("Enter the country of your Player");
        nationalField.setBounds(800, 300, 190, 40);
        nationalField.setBackground(Color.GREEN);
        nationalField.setOpaque(true);

        JTextField nameField = new JTextField();
        nameField.setBounds(1000, 100,200,40);

        JComboBox<Position> positionJComboBox = new JComboBox<>(Position.values());
        positionJComboBox.setBounds(1000, 200,200,40);
        positionJComboBox.setSelectedIndex(0);

        JComboBox<Nationality> nationalityJComboBox = new JComboBox<>(Nationality.values());
        nationalityJComboBox.setBounds(1000, 300,200,40);
        nationalityJComboBox.setSelectedIndex(0);

        JLabel background = new JLabel(new ImageIcon("create_player1.jpg"));
        background.setBounds(0,0, 1280, 720);


        JButton button = new JButton("Chose your team");
        button.setBounds(1000, 600, 150, 60);
        button.addActionListener(e ->{
            this.player = new Player.Builder(nameField.getText(),
                    (Position) positionJComboBox.getSelectedItem(),
                    (Nationality) nationalityJComboBox.getSelectedItem()).build();
            new ChoseTeam(this.player);
            super.setVisible(false);
        });


        // frame setup

        super.setTitle("Footbal Simulator");
        super.setSize(1280, 760);
        super.setVisible(true);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setResizable(false);
        super.setLayout(null);


        //adding components to the frame

        super.add(nationalField);
        super.add(positionField);
        super.add(nameLabel);
        super.add(button);
        super.add(nameField);
        super.add(positionJComboBox);
        super.add(nationalityJComboBox);
        super.add(background);
    }

}
