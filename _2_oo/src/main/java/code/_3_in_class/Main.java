package code._3_in_class;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        IBoxer ion = new SuperBoxer("ion", 100, 10);
        IBoxer vasile = new Boxor( "vasile", 100, 10);


        startBoxingMatch(ion, vasile);
        endingResults(ion);
    }

    private static void endingResults(IBoxer ion) {
        if(!ion.isAlive())
            System.out.println("Vasile won!");
        else
            System.out.println("Ion won!");
    }

    //startBoxingMatch_Boxor_Boxor
    //startBoxingMatch_IBoxer_IBoxer
    private static void startBoxingMatch(IBoxer ion, IBoxer vasile) {
        Random random = new Random();

        while(ion.isAlive() && vasile.isAlive())
        {
            int randVar = random.nextInt(2);
            if(randVar == 1)
                ion.attack(vasile);
            else
                vasile.attack(ion);
        }
    }
}