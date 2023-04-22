package code._3_in_class;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //TODO put your code changes in here
        Boxer ion = new Boxer("ion", 100, 10);
        Boxer vasile = new Boxer("vasile");


        startBoxingMatch(ion, vasile);
        endingResults(ion);
    }

    private static void endingResults(Boxer ion) {
        if (ion.health <= 0) {
            System.out.println("Vasile a castigat meciul");
        } else {
            System.out.println("Ion a castigat meciul");
        }
    }



    private static void startBoxingMatch(Boxer ion, Boxer vasile) {
        Random random = new Random();
        while(ion.health >0 && vasile.health >0) {
            int zeroOrOne = random.nextInt(2);
            if(zeroOrOne ==0) {
                ion.attack(vasile);
            } else {
            vasile.attack(ion);
        }
    }
    }
}
