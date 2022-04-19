package GUI;

import Teams.ManCity;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DisplayManCityTeamGUI extends JFrame {

    public DisplayManCityTeamGUI(){
        String[] col = {"Name", "Position", "Nationality", "Pace", "Shooting", "Defence", "Dribbling", "Passing", "Physicality"};

        DefaultTableModel tableModel = new DefaultTableModel(col, 0);

        JTable table = new JTable(tableModel);

        JScrollPane tableContainer = new JScrollPane(table);
        tableContainer.setBounds(0, 0, 1600, 1280);

        Object[] objects = new Object[9];

        for(int i = 0; i< ManCity.getPlayerList().size(); i++){
            objects[0] = ManCity.getPlayerList().get(i).getName();
            objects[1] = ManCity.getPlayerList().get(i).getPosition();
            objects[2] = ManCity.getPlayerList().get(i).getNationality();
            objects[3] = ManCity.getPlayerList().get(i).getPace();
            objects[4] = ManCity.getPlayerList().get(i).getShooting();
            objects[5] = ManCity.getPlayerList().get(i).getDefense();
            objects[6] = ManCity.getPlayerList().get(i).getDribbling();
            objects[7] = ManCity.getPlayerList().get(i).getPassing();
            objects[8] = ManCity.getPlayerList().get(i).getPhysical();
            tableModel.addRow(objects);
        }

        super.setTitle("Manchester City Team");
        super.setSize(1600, 720);
        super.setVisible(true);
        super.setResizable(false);
        super.setLayout(null);

        super.add(tableContainer);
    }

}
