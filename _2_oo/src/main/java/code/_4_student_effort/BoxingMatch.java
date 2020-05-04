package code._4_student_effort;

public class BoxingMatch {
    Fighter fighter1, fighter2;

    public BoxingMatch(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public String fight() {
        if (fighter1.attack(fighter2) > 0) {
            return fighter1.name;
        }
        return fighter2.name;
    }

    public static void main(String[] args) {

        Fighter f1 = new Fighter();
        Fighter f2 = new Fighter();
        BoxingMatch match = new BoxingMatch(f1, f2);

        System.out.println(match.fight());
    }
}
