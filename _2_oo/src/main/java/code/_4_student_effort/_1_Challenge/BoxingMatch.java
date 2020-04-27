package code._4_student_effort._1_Challenge;

public class BoxingMatch {
    private Fighter fighter1;
    private Fighter fighter2;

    BoxingMatch(Fighter other1, Fighter other2){
        this.fighter1 = other1;
        this.fighter2 = other2;
    }

    public String fight(){
        while(fighter1.health > 0 && fighter2.health > 0){
            fighter1.attack(fighter2);
            fighter2.attack(fighter1);
        }
        if(fighter1.health > fighter2.health)
            return fighter1.name;
        else
            return fighter2.name;
    }
}
