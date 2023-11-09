package code._3_in_class;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        //TODO put your code changes in here
        IBoxer ion=new Boxer("ion", 100, 10);
        IBoxer vasile=new Boxer("vasile");

        startBoxingMatch(ion, vasile);
        announceVictory(ion);
    }
    private static void announceVictory(Boxer ion) {
        if(ion.health<=0)
            System.out.println("vasile goooo");
        else
            System.out.println("ion gooooo");
    }

    //startingBoxingMatch


    private static void startBoxingMatch(Boxer ion, Boxer vasile){
        Random random= new Random();
        while (ion.health>0 && vasile.health>0){
            int zeroOrOne= random.nextInt(2);
            if(zeroOrOne==0)
                ion.attak((vasile));
            else
                vasile.attak((ion));
        }
    }
}