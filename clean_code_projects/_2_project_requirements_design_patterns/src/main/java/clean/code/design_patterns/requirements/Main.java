package clean.code.design_patterns.requirements;
import model.Singer;



public class Main {

        public static void main(String[] args) {
            SingerFactory singerFactory = SingerFactory.getInstance();
            Singer singer1 = singerFactory.createSinger("GUITAR");
            Singer singer2 = singerFactory.createSinger("PIANO");

            singer1.setName("Joe");
            singer2.setName("Alice");
            singer1.sing();
            singer2.sing();

            SingerFactory singerFactoryDoi =  SingerFactory.getInstance();
            Singer singer3 = singerFactoryDoi.createSinger("GUITAR");
            singer3.sing();

            System.out.println("TOTAL SINGERS IN APP: " + SingerFactory.getInstance().getNumarSingeriCreati());
        }
    }

