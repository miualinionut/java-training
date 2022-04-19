package GUI;

import Teams.ManUnited;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DisplayManUnitedTeamGUI extends JFrame {

    public DisplayManUnitedTeamGUI(){


        String[] col = {"Name", "Position", "Nationality", "Pace", "Shooting", "Defence", "Dribbling", "Passing", "Physicality"};

        DefaultTableModel tableModel = new DefaultTableModel(col, 0);

        JTable table = new JTable(tableModel);

        JScrollPane tableContainer = new JScrollPane(table);
        tableContainer.setBounds(0, 0, 1600, 1280);

        Object[] objects = new Object[9];

        for(int i=0; i<ManUnited.getPlayerList().size();i++){
            objects[0] = ManUnited.getPlayerList().get(i).getName();
            objects[1] = ManUnited.getPlayerList().get(i).getPosition();
            objects[2] = ManUnited.getPlayerList().get(i).getNationality();
            objects[3] = ManUnited.getPlayerList().get(i).getPace();
            objects[4] = ManUnited.getPlayerList().get(i).getShooting();
            objects[5] = ManUnited.getPlayerList().get(i).getDefense();
            objects[6] = ManUnited.getPlayerList().get(i).getDribbling();
            objects[7] = ManUnited.getPlayerList().get(i).getPassing();
            objects[8] = ManUnited.getPlayerList().get(i).getPhysical();
            tableModel.addRow(objects);
        }

        super.setTitle("Manchester United Team");
        super.setSize(1600, 720);
        super.setVisible(true);
        super.setResizable(false);
        super.setLayout(null);

        super.add(tableContainer);
    }

}
