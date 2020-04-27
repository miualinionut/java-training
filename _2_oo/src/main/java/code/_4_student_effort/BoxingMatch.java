package code._4_student_effort;

public class BoxingMatch {

    private Fighter firstFighter;
    private Fighter secondFighter;

    public BoxingMatch(Fighter firstFighter, Fighter secondFighter) {
        this.firstFighter = firstFighter;
        this.secondFighter = secondFighter;
    }

    public String fight() {

        while (firstFighter.health > 0 && secondFighter.health > 0) {
            firstFighter.attack(secondFighter);
            secondFighter.attack(firstFighter);
        }

        if(firstFighter.health <= 0)
            return secondFighter.name;
        else
            return firstFighter.name;
    }
}
