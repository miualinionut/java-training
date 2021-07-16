package code._4_student_effort;

import java.util.Scanner;

public class BoxingMatch {
    private Fighter fighter1;
    private Fighter fighter2;

    public BoxingMatch(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public String fight(){
        System.out.println("Choose which player to start first: ");
        Scanner scan = new Scanner(System.in);
        int op = scan.nextInt();

        switch(op) {
            case 1: {
                while (fighter1.health > 0 && fighter2.health > 0) {
                    fighter1.attack(fighter2);
                    fighter2.attack(fighter1);
                }
                break;
            }
            case 2:{
                while (fighter1.health > 0 && fighter2.health > 0) {
                    fighter2.attack(fighter1);
                    fighter1.attack(fighter2);
                }
                break;
             }
            default :{
                System.out.println("Invalid option");
            }
        }

            if(fighter1.health <= 0){
                return fighter2.name;
            }
            else{
                return fighter1.name;
            }
    }
}
