package code._4_student_effort.TwoFighters;

public class BoxingMatch {
    Fighter fighter1;
    Fighter fighter2;
    BoxingMatch(Fighter fighter1, Fighter fighter2){
        this.fighter1=fighter1;
        this.fighter2=fighter2;
    }
    public String fight(){
        while(fighter1.health>0 || fighter2.health>0){
            fighter1.health-=fighter2.damagePerAttack;
            fighter2.health-= fighter1.damagePerAttack;
        }

        if(fighter1.health<=0){
            return fighter2.name;
        }else{
            return fighter1.name;
        }
    }
}
