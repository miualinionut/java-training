package code._3_in_class;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Boxor ion = new Boxor("ion", 100, 10);
        Boxor vasile = new Boxor( "vasile", 100, 10);


        startBoxingMatch(ion, vasile);
        endingResults(ion);
    }

    private static void endingResults(Boxor ion) {
        if(ion.health <= 0)
            System.out.println("Vasile won!");
        else
            System.out.println("Ion won!");
    }

    private static void startBoxingMatch(Boxor ion, Boxor vasile) {
        Random random = new Random();

        while(ion.health > 0 && vasile.health > 0)
        {
            int randVar = random.nextInt(2);
            if(randVar == 1)
                ion.attack(vasile);
            else
                vasile.attack(ion);
        }
    }
}