package code._3_in_class;
import javax.swing.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //TODO put your code changes in here
        Boxer Ion = new Boxer("Ion",100,14);
        Boxer Vasile = new Boxer("Vasile",100,10);
        Boxer bruceLee = new BruceLee("Bruce Lee");
        startBoxingMatch(Ion,bruceLee);
        //startBoxingMatch(Ion,Vasile);
        announceVictory(Ion,bruceLee);
        }

    private static void announceVictory(Boxer b1, Boxer b2){
        if(b1.health <= 0)
            System.out.println(b2.name + " a castigat.");
        else
            System.out.println(b1.name + " a castigat.");

    }

    private static void startBoxingMatch(Boxer b1, Boxer b2) {
        Random ran = new Random();
        int zeroOrOne = ran.nextInt(100);
        while (b1.health > 0 && b2.health > 0) {
            if (zeroOrOne % 2 == 0)
                b1.attack(b2);
             else
                b2.attack(b1);
        }
    }

}