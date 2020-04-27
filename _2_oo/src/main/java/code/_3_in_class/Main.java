package code._3_in_class;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        int i = 5;//primitiva

        Masina m = new Masina("rosu","mercedes",70); //referinta
        Masina m2 = new Masina("rosu","mercedes",70);
        System.out.println(m + " " + m2);

        //cum returnezi numele masinii m?
        m.setViteza(56);
        System.out.println(m.getViteza());
//        m.start();
//        m.stop();
//        Date d  = (Date) m.getDataFabricatie();
//        d.setYear(1888);
    }
}