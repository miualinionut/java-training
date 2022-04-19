package GUI;

import Model.Player;

import javax.swing.*;
import java.awt.*;

public class ManCityGUI extends JFrame {

    public static int money = 300000;

    public ManCityGUI(Player player){
        JLabel moneyLabel = new JLabel("  Current bank: "+ money);
        moneyLabel.setBounds(0,0, 150, 50);
        moneyLabel.setOpaque(true);
        moneyLabel.setBackground(Color.GRAY);

        JButton refresh = new JButton("Refresh Money");
        refresh.setBounds(0, 50, 150, 50);
        refresh.addActionListener(a->moneyLabel.setText("  Current bank: "+ money));

        JLabel title = new JLabel("Welcome to the Manchester City team");
        title.setOpaque(true);
        title.setBounds(600, 50, 400, 200);
        title.setFont(new Font("Arial", Font.BOLD, 20));

        JLabel name = new JLabel("Name: " + player.getName());
        name.setOpaque(true);
        name.setBounds(600, 200, 150, 50);

        JLabel position = new JLabel("Position: " + player.getPosition());
        position.setOpaque(true);
        position.setBounds(600, 250, 150, 50);

        JLabel nationality = new JLabel("Nationality: " + player.getNationality());
        nationality.setOpaque(true);
        nationality.setBounds(600, 300, 150, 50);

        JLabel manUnitedShirt = new JLabel(new ImageIcon("man_city_shirt.jpg"));
        manUnitedShirt.setBounds(50, 100, 450, 600);

        JButton stats = new JButton("Stats of the player");
        stats.setBounds(600, 600, 150, 50);
        stats.addActionListener(a-> new DisplayPlayerStatsGUI(player));

        JButton store = new JButton("Store Player");
        store.setBounds(800, 600, 150, 50);
        store.addActionListener(a->new ManCityStoreGUI());

        JButton upgradeStats = new JButton(("Upgrade Stats"));
        upgradeStats.setBounds(1000, 600, 150, 50);
        upgradeStats.addActionListener(a->{
            player.setDefense(player.getDefense()+1);
            player.setDribbling(player.getDribbling()+1);
            player.setPace(player.getPace()+1);
            player.setPassing(player.getPassing()+1);
            player.setPhysical(player.getPhysical()+1);
            player.setShooting(player.getShooting()+1);
            if(money >= 50000 ){
                money = money - 50000;
                moneyLabel.setText("  Current bank: "+money);
            }
        });

        JButton displayTeam = new JButton("Display Team");
        displayTeam.setBounds(800, 500, 150, 50);
        displayTeam.addActionListener(a->new DisplayManCityTeamGUI());
        // setting the frame

        super.setTitle("Football Simulator");
        super.setSize(1280, 760);
        super.setVisible(true);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setResizable(false);
        super.setLayout(null);

        // adding components
        super.add(displayTeam);
        super.add(refresh);
        super.add(upgradeStats);
        super.add(store);
        super.add(stats);
        super.add(nationality);
        super.add(position);
        super.add(name);
        super.add(moneyLabel);
        super.add(title);
        super.add(manUnitedShirt);
    }

}
