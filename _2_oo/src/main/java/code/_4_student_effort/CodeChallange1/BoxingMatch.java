package code._4_student_effort.CodeChallange1;

public class BoxingMatch {
    private final Fighter fighter1;
    private final Fighter fighter2;

    public BoxingMatch(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public String fight(){
        while(this.fighter1.getHealth() > 0 && this.fighter2.getHealth() > 0){
            this.fighter1.attack(this.fighter2);
            this.fighter2.attack(this.fighter1);
        }
        return this.fighter1.getHealth() <= 0 ? this.fighter2.getName() : this.fighter1.getName();
    }
}
