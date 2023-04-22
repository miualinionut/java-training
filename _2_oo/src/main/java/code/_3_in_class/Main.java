package code._3_in_class;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        //TODO put your code changes in here
        Boxer ion = new Boxer("ion",100,10 );
        Boxer vasile = new Boxer("vasile");
        
        //start meci
        startBoxingMatch(ion, vasile);
        announceVictory(ion);

    }

    private static void announceVictory(Boxer ion) {
        if(ion.health<=0) {
            System.out.println(" Ion a castigat meciul de box.");
        }else {
            System.out.println(" Vasile a castigat meciul de box.");
        }
    }

    private static void startBoxingMatch(Boxer ion, Boxer vasile) {
        Random random = new Random();

        while(ion.health >0 && vasile.health>0 )
        {   int zeroOrOne = random.nextInt( 2);
            if(zeroOrOne == 0)
                ion.attack(vasile);
                else
                vasile.attack(ion);

        }
    }
}