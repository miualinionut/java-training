package code._4_student_effort.Challenge1;

public class BoxingMatch {

    Fighter fighter1;
    Fighter fighter2;

    public BoxingMatch(){
        fighter1 = new Fighter();
        fighter2 = new Fighter();
    }

    public String fight() {
        if(fighter1.getHealth() > fighter2.getHealth())
            return fighter1.getName();
        else return fighter2.getName();
    }

}
