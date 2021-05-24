package code._4_student_effort;

public class BoxingMatch {
    Fighter fighter1;
    Fighter fighter2;
    public BoxingMatch(Fighter f1, Fighter f2){
        fighter1=f1;
        fighter2=f2;
    }

    public String fight(){
        while(fighter1.heath>0 || fighter2.heath>0){
            fighter1.attack(fighter2);
            fighter2.attack(fighter1);
        }

        if(fighter1.heath> fighter2.heath)
            return "Fighter 1 has won!";
        else
            return "Fighter 2 has won!";

    }
}
