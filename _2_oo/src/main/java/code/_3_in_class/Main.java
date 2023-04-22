package code._3_in_class;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Boxer ion=new Boxer("Ion",100, 10);
        Boxer vasile= new Boxer("Vasile");
        Boxer bruceLee=new BruceLee("bruce lee");
        //start meci
        startBoxingMatch(ion, bruceLee);
        //anuntam castigatorul
        announceVictory(ion, bruceLee);

    }

    private static void announceVictory(IBoxer b01, IBoxer b02) {
        if(b01.isAlive())
        {
            System.out.println(b01.getNume() + " a castigat meciul");

        }else{
            System.out.println(b02.getNume() + " a castigat meciu");
        }
    }

    private static void startBoxingMatch(IBoxer ion, IBoxer vasile) {
        Random random=new Random();
        while(ion.isAlive() && vasile.isAlive()) {
            int zeroOrOne = random.nextInt(4);
            if (zeroOrOne == 1 || zeroOrOne==0) {
                ion.attack((Boxer) vasile);
            } else {
                vasile.attack((Boxer) ion);
            }
        }
    }
}