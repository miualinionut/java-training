package code._4_student_effort.TwoFightersOneWinner;

public class BoxingMatch {
    Fighter fighter1;
    Fighter fighter2;

    public BoxingMatch(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }
    public void fight(){

        while(fighter1.getHealth() >=0 && fighter2.getHealth() >=0 ) {
            fighter1.attack(fighter2);
            fighter2.attack(fighter1);
        }
        if(fighter1.getHealth() > 0){
            System.out.println("The winner is " + fighter1.getName());
        } else if(fighter2.getHealth() > 0){
            System.out.println("The winner is " + fighter2.getName());
        } else if(fighter1.getHealth() <= 0 && fighter2.getHealth() <= 0){
            System.out.println("Draw");
        }
    }
}
