package GUI;

import Model.Player;

import javax.swing.*;
import java.awt.*;

public class DisplayPlayerStatsGUI extends JFrame {

    public DisplayPlayerStatsGUI(Player player){

        JLabel pace = new JLabel("Pace: " + player.getPace());
        pace.setOpaque(true);

        JLabel shooting = new JLabel("Shooting: " + player.getShooting());
        shooting.setOpaque(true);

        JLabel dribbling = new JLabel("Dribbling: "+player.getDribbling());
        dribbling.setOpaque(true);

        JLabel passing = new JLabel("Passing: " + player.getPassing());
        passing.setOpaque(true);

        JLabel defending = new JLabel("Defending: " +player.getDefense());
        defending.setOpaque(true);

        JLabel physicality = new JLabel("Physicality: " + player.getPhysical());
        physicality.setOpaque(true);

        super.setTitle("Player Stats");
        super.setSize(640, 480);
        super.setVisible(true);
        super.setResizable(false);
        super.setLayout(new GridLayout(3, 2));


        super.add(pace);
        super.add(shooting);
        super.add(dribbling);
        super.add(passing);
        super.add(defending);
        super.add(physicality);
    }

}
