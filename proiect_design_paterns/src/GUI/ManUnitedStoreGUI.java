package GUI;

import Model.Nationality;
import Model.Player;
import Model.Position;
import Store.ManUnitedStore;
import Store.Store;


import javax.swing.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ManUnitedStoreGUI extends JFrame {

    public ManUnitedStoreGUI(){

       AtomicInteger buyCountMbappe = new AtomicInteger(1);
       AtomicInteger buyCountramos = new AtomicInteger(1);

        JButton kyllian = new JButton("Buy Kyllian Mbappe");
        kyllian.setBounds(0, 0, 150, 50);
        kyllian.addActionListener(a->{
            while (buyCountMbappe.get() > 0 && ManUnitedGUI.money >100000) {
                ManUnitedGUI.money = ManUnitedGUI.money - 100000;
                Player mbappe = new Player.Builder("Kyllian Mbappe", Position.STRIKER, Nationality.FRANCE)
                        .setPace(96)
                        .setDribbling(90)
                        .setDefense(32)
                        .setPassing(78)
                        .setPhysical(80)
                        .setShooting(89)
                        .build();
                Store store = new Store();
                store.pay(new ManUnitedStore(), mbappe);
                buyCountMbappe.decrementAndGet();
            }
        });
        JButton ramos = new JButton("Buy Sergio Ramos");
        ramos.setBounds(150, 0, 150, 50);
        ramos.addActionListener(a->{
            while (buyCountramos.get() >0 && ManUnitedGUI.money >100000){
            ManUnitedGUI.money = ManUnitedGUI.money-100000;
            Player sergio = new Player.Builder("Sergio Ramos", Position.DEFENDER, Nationality.SPAIN)
                    .setPace(71)
                    .setDribbling(70)
                    .setDefense(90)
                    .setPassing(74)
                    .setPhysical(88)
                    .setShooting(70)
                    .build();
            Store store = new Store();
            store.pay(new ManUnitedStore(), sergio);
            buyCountramos.decrementAndGet();
            }
        });

        super.setTitle("Player Store");
        super.setSize(640, 480);
        super.setVisible(true);
        super.setResizable(false);
        super.setLayout(null);

        super.add(kyllian);
        super.add(ramos);
    }

}
