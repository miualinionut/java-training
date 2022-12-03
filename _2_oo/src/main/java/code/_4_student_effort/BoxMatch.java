package code._4_student_effort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BoxMatch {

    private static List<Fighter> boxers = new ArrayList<>();
    private Fighter redCorner;
    private Fighter blueCorner;

    public BoxMatch(Fighter redCorner, Fighter blueCorner) {
        this.redCorner = redCorner;
        this.blueCorner = blueCorner;
    }

    public static void main(String[] args) {
        DefensiveFighter mayweather = new DefensiveFighter("Money Mayweather", 15.0, 115.0);
        mayweather.setDefence(1);
        NeutralFighter bruceLee= new NeutralFighter("Bruce Lee", 20.0,130.0);
        bruceLee.setDefence(2);
        OffensiveFighter mikeTyson = new OffensiveFighter("Mike Tyson", 30.0, 150.0);
        mikeTyson.setDefence(3);


        boxers.add(mayweather);
        boxers.add(bruceLee);
        boxers.add(mikeTyson);
        System.out.println("The boxers are: ");
        for(int i=0;i< boxers.size();i++)
        {
            System.out.println(i+". "+boxers.get(i).name);
        }
        Scanner myInput=new Scanner(System.in);
        System.out.println("The Red Corner: ");
        int firstPlayer=myInput.nextInt();
        System.out.println("The Blue Corner: ");
        int secondPlayer= myInput.nextInt();
        BoxMatch boxingMatch = new BoxMatch(boxers.get(firstPlayer),boxers.get(secondPlayer));
        String winner = boxingMatch.fight();
        System.out.println(winner + " has won !");
    }

    public String fight() {
        while (redCorner.health > 0 && blueCorner.health > 0) {
            Random random = new Random();
            int chance = random.nextInt(2);

            if (chance == 0) {
                redCorner.attack(blueCorner);
            } else {
                blueCorner.attack(redCorner);
            }
        }
        if (redCorner.health <= 0) {
            return blueCorner.name;
        }
            return redCorner.name;
    }


}