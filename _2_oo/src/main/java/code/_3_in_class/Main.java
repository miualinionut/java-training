package code._3_in_class;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //TODO put your code changes in here
        Boxer ion = new Boxer("ion", 100, 10);
        Boxer vasile = new Boxer("vasile");
        Boxer bruceLee = new BruceLee("bruzli", 100, 10);
//        startBoxingMatch(ion, vasile);
//        announceVictory(ion);

        startBoxingMatch(bruceLee, ion);
        announceVictory(bruceLee);
    }


    private static void announceVictory(Boxer ion) {
        // anuntam castigatorul
        if(ion.health <= 0) {
            System.out.println(ion.nume + " a castigat meciul");
        } else {
            System.out.println("Celalalt a castigat meciul");
        }
    }

    private static void startBoxingMatch(Boxer ion, Boxer vasile) {
        Random random = new Random();
        // start meci
        while(ion.health >= 0 && vasile.health >= 0) {
            int zeroOrOne = random.nextInt(2);
            if(zeroOrOne == 0 ) {
                ion.attack(vasile);
            } else {
                vasile.attack(ion);
            }
        }
    }
}