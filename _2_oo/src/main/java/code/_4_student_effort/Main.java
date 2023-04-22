package code._4_student_effort;

import javax.swing.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //TODO put your code changes in her
        Boxer andrei = new Boxer("Andrei",15, 800, 15, 3);
        Boxer tibi = new Boxer("Tibi", 30, 500, 10, 4);
        while (andrei.getHealth() > 0 && tibi.getHealth() > 0) {
            Random random = new Random();
            int value = random.nextInt(2);
            if(value == 0){
                andrei.attack(tibi);
            }
            else {
                tibi.attack(andrei);
            }
        }
        System.out.println();
        System.out.println();
        if(andrei.getHealth() >0){
            System.out.println(andrei.name + " a castigat meciul! (viata ramasa:" + andrei.getHealth() + ")");
        }else {
            System.out.println(tibi.name + " a castigat meciul! (viata ramasa:" + tibi.getHealth() + ")");
        }
    }
}
