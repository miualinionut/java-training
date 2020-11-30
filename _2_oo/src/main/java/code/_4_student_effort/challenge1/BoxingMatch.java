package code._4_student_effort.challenge1;

public class BoxingMatch {

    private   Fighter fighter1;
    private Fighter fighter2;


    public BoxingMatch(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public static String fight(Fighter fighter1, Fighter fighter2) {
        while (fighter1.getHealth() >= 0 && fighter2.getHealth() >= 0) {
            System.out.println(fighter1.getHealth());
            System.out.println(fighter2.getHealth());
            fighter1.atack(fighter2);
            fighter2.atack(fighter1);
        }
        if(fighter1.getHealth()>=0)
            return  fighter1.getName();
        else
            return fighter2.getName();
    }


}
