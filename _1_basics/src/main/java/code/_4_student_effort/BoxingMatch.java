package code._4_student_effort;

public class BoxingMatch {
//    private Fighter fighter1;
//    private Fighter fighter2;
//
//    public BoxingMatch(Fighter fighter1, Fighter fighter2) {
//        this.fighter1 = fighter1;
//        this.fighter2 = fighter2;
//    }

    public static void fight(Fighter fighter1, Fighter fighter2){

        while ((fighter1.health > 0) && (fighter2.health > 0)){
            fighter1.attack(fighter2);
            if((fighter2.health <= 0)){
                System.out.println(fighter1.name + " wins!");
                break;
            }

            fighter2.attack(fighter1);
            if (fighter1.health <= 0) {
                System.out.println(fighter2.name + " wins!");
                break;
            }



        }




    }
}
