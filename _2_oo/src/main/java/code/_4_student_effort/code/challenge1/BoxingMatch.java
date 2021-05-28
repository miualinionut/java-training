package code._4_student_effort.code.challenge1;

public class BoxingMatch {
    private Fighter fighter1;
    private Fighter fighter2;
    public BoxingMatch(Fighter fighter1, Fighter fighter2){
        this.fighter1=fighter1;
        this.fighter2=fighter2;
    }
    public String fight(){
        if(fighter1.getDamagePerAttack()>fighter2.getDamagePerAttack()){
            return fighter1.getName();
        }
        else if(fighter2.getDamagePerAttack()> fighter1.getDamagePerAttack()){
            return fighter2.getName();
        }
        else if(fighter2.getHeath()> fighter1.getHeath()){
            return fighter2.getName();
        } else if(fighter2.getHeath()< fighter1.getHeath()){
            return fighter1.getName();
        }

        return "Equality";
    }

    public void setFighter1(Fighter fighter1) {
        this.fighter1 = fighter1;
    }

    public void setFighter2(Fighter fighter2) {
        this.fighter2 = fighter2;
    }
}
