package code._4_student_effort;

public class BoxingMatch {
    private Fighter fighter1;
    private Fighter fighter2;

    public BoxingMatch(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public String Fight() {
        while (fighter1.getHealth() > 0 && fighter2.getHealth() > 0) {
            fighter1.Attack(fighter2);
            fighter2.Attack((fighter1));
        }

        return fighter1.getHealth() > 0 ? fighter1.getName() : fighter2.getName();
    }
}
