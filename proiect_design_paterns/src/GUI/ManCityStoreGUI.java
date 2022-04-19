package GUI;

import Model.Nationality;
import Model.Player;
import Model.Position;
import Store.Store;
import Store.ManCityStore;

import javax.swing.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ManCityStoreGUI extends JFrame {

    public ManCityStoreGUI(){
        AtomicInteger buyCountMessi = new AtomicInteger(1);
        AtomicInteger buyCountNeymar = new AtomicInteger(1);

        JButton messi = new JButton("Buy Lionel Messi");
        messi.setBounds(0, 0, 150, 50);
        messi.addActionListener(a->{
            while (buyCountMessi.get() > 0 && ManCityGUI.money >100000) {
                ManUnitedGUI.money = ManUnitedGUI.money - 100000;
                Player mbappe = new Player.Builder("Lionel Messi", Position.STRIKER, Nationality.ARGENTINA)
                        .setPace(88)
                        .setDribbling(96)
                        .setDefense(34)
                        .setPassing(91)
                        .setPhysical(75)
                        .setShooting(92)
                        .build();
                Store store = new Store();
                store.pay(new ManCityStore(), mbappe);
                buyCountMessi.decrementAndGet();
            }
        });
        JButton neymar = new JButton("Buy Neymar");
        neymar.setBounds(150, 0, 150, 50);
        neymar.addActionListener(a->{
            while (buyCountNeymar.get() >0 && ManCityGUI.money >100000){
                ManUnitedGUI.money = ManUnitedGUI.money-100000;
                Player sergio = new Player.Builder("Neymar", Position.STRIKER, Nationality.BRAZIL)
                        .setPace(91)
                        .setDribbling(95)
                        .setDefense(30)
                        .setPassing(86)
                        .setPhysical(63)
                        .setShooting(84)
                        .build();
                Store store = new Store();
                store.pay(new ManCityStore(), sergio);
                buyCountNeymar.decrementAndGet();
            }
        });

        super.setTitle("Player Store");
        super.setSize(640, 480);
        super.setVisible(true);
        super.setResizable(false);
        super.setLayout(null);

        super.add(messi);
        super.add(neymar);
    }


}
