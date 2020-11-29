package code._4_student_effort;

public class BoxingMatch {
    private Fighter fighter1;
    private Fighter fighter2;

    public BoxingMatch(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public String Fight() {
        do {
            fighter1.Attack(fighter2);
            fighter2.Attack(fighter1);
        } while (fighter1.health > 0 && fighter2.health > 0);

        if (fighter1.health == 0)
            return fighter1.name;
        else return fighter2.name;
    }



    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Fighter_1", 40, 10);
        Fighter fighter2 = new Fighter("Fighter_2", 30, 15);

        BoxingMatch match = new BoxingMatch(fighter1, fighter2);
        System.out.println("The winner is:");
        String winner = match.Fight();
        System.out.println(winner);
    }
}