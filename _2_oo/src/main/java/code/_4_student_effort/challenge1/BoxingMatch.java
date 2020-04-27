package code._4_student_effort.challenge1;

public class BoxingMatch {

    Fighter opponent1;
    Fighter opponent2;

    BoxingMatch() {
    }

    ;

    BoxingMatch(Fighter gigel, Fighter marcel) {

        this.opponent1 = marcel;
        this.opponent2 = gigel;

    }

    String fight() {
        return opponent1.attack(opponent2);
    }


}
