package code._4_student_effort.fighter;

public class BoxingMatch {
    private Fighter firstFighter;
    private Fighter secondFighter;

    public BoxingMatch (Fighter firstFighter, Fighter secondFighter) {
        this.firstFighter = firstFighter;
        this.secondFighter = secondFighter;
    }

    public String fight() {
        if (firstFighter.getHealth() >= 0 && secondFighter.getHealth() >= 0) {
            firstFighter.attack(secondFighter);
            secondFighter.attack(firstFighter);
        }

        if (firstFighter.getHealth() > secondFighter.getHealth()) {
            return firstFighter.getName();
        } else {
            return secondFighter.getName();
        }
    }

    public static void main(String[] args) {
        Fighter firstFighter = new Fighter("First", 100, 7);
        Fighter secondFighter = new Fighter("Second", 100, 13);

        BoxingMatch match = new BoxingMatch(firstFighter, secondFighter);
        System.out.println(match.fight());
    }
}
