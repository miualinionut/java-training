package code._4_student_effort.TwoFightersOneWinner;

import java.util.Scanner;

public class BoxingArena {

    private Fighter readFighter(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nume luptator : ");
        String nume = scanner.nextLine();

        System.out.println("Putere luptator:");
        int damagePerAttack = scanner.nextInt();

        System.out.println("Viata luptator:");
        int health = scanner.nextInt();

        return new Fighter(nume, damagePerAttack, health);
    }

    private String fight(Fighter fighter1, Fighter fighter2){
        String result = "";

        while(fighter1.health >= 0 && fighter2.health >= 0){
            fighter1.attack(fighter2);
            if(fighter2.health>0)
            fighter2.attack(fighter1);
        }

        if(fighter1.health <= 0)
            result = fighter2.name;
        else
            result = fighter1.name;

        return result;
    }
    public void run(){
        Fighter fighter1 = readFighter();
        Fighter fighter2 = readFighter();
        String result = fight(fighter1, fighter2);
        System.out.println(result);
    }
}
