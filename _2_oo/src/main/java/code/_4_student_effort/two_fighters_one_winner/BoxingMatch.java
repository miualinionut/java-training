package code._4_student_effort.two_fighters_one_winner;

public class BoxingMatch {
    protected Fighter fighter1;
    protected Fighter fighter2;

    public BoxingMatch(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public String fight () {
        while (fighter1.health > 0 && fighter2.health > 0) {
            fighter1.attack(fighter2);
            fighter2.attack(fighter1);
        }

        if (fighter1.health == fighter2.health)
            return "Draw";

        if (fighter1.health < fighter2.health)
            return fighter2.name;
        else
            return fighter1.name;
    }
}
