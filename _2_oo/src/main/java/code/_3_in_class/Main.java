package code._3_in_class;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //TODO put your code changes in here
        Boxer ionBoxer = new Boxer("Ion", 100, 10);

        Boxer vasileBoxer = new Boxer("Vasile", 100, 20);
        Random random = new Random();

        matchMaking(ionBoxer, vasileBoxer, random);
        showWinner(ionBoxer);
    }

    private static void showWinner(Boxer ionBoxer) {
        if(ionBoxer.health < 0){
            System.out.println("Vasile e smecher");
        } else {
            System.out.println("Ion e smecher");
        }
    }

    private static void matchMaking(Boxer ionBoxer, Boxer vasileBoxer, Random random) {
        while(ionBoxer.health > 0 && vasileBoxer.health > 0 )
        {
            int zeroOrOne = random.nextInt(2);
            if(zeroOrOne == 0){
                ionBoxer.attack(vasileBoxer);
            }else {
                vasileBoxer.attack(ionBoxer);
            }
        }
    }
}