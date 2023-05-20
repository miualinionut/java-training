package code._3_in_class;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Boxer ion = new Boxer("ion",100,10);
        Boxer vasile = new Boxer("vasile",100,10);

        Random random = new Random();

        startBoxingMatch(ion, vasile, random);

        //anuntam castigatorul
        endingResult(ion);
    }

    private static void endingResult(Boxer ion) {
        if(ion.health < 0) {
            System.out.println("Vasile a castigat meciul");
        }
        else{
            System.out.println("Ion a castigat meciul");
        }
    }

    private static void startBoxingMatch(Boxer ion, Boxer vasile, Random random) {
        while(ion.health > 0 && vasile.health > 0) {
            int zeroOrOne = random.nextInt(2);
            if (zeroOrOne == 0) {
                ion.attack(vasile);
            } else {
                vasile.attack(ion);
            }
        }
    }
}