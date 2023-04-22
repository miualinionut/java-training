package code._3_in_class;

import java.util.Random;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
        //TODO put your code changes in here
        Boxer ion = new Boxer("ion", 100, 10);
        Boxer vasile = new Boxer("vasile");

        AnuntareWinner(ion, vasile);
    }

    private static void AnuntareWinner(Boxer a, Boxer b){
        if(a.health <= 0){
            System.out.println(b.name + "a castigat meciul");
        }
        else{
            System.out.println(a.name + "a castigat meciul");
        }
    }


}