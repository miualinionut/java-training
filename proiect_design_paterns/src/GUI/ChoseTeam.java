package GUI;
import Model.Player;
import Teams.ManCity;
import Teams.ManUnited;

import javax.swing.*;
import java.awt.*;

public class ChoseTeam extends JFrame {

    public ChoseTeam(Player player){

        JButton manUnited = new JButton("Manchester United");
        manUnited.setBackground(Color.RED);
        manUnited.setFont(new Font("Arial", Font.BOLD, 50));
        manUnited.addActionListener(e -> {
            ManUnited manUnited1 = new ManUnited();
            Player mainPlayer = manUnited1.addMainPlayer(player);
            manUnited1.fillTeam();
            new ManUnitedGUI(mainPlayer);
            super.setVisible(false);
        });

        JButton manCity = new JButton("Manchester City");
        manCity.setBackground(Color.CYAN);
        manCity.setFont(new Font("Arial", Font.BOLD, 50));
        manCity.addActionListener(a->{
            ManCity manCity1 = new ManCity();
            Player mainPlayer = manCity1.addMainPlayer(player);
            manCity1.fillTeam();
            new ManCityGUI(mainPlayer);
            super.setVisible(false);
        });

        super.setTitle("Football Simulator");
        super.setSize(1024, 768);
        super.setVisible(true);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setResizable(false);
        super.setLayout(new GridLayout(1, 2));

        super.add(manUnited);
        super.add(manCity);

    }

}
