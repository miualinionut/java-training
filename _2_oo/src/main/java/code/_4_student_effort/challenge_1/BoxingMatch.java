package code._4_student_effort.challenge_1;

public class BoxingMatch {
    private Fighter f1;
    private Fighter f2;

    BoxingMatch(Fighter input1, Fighter input2) {
        f1 = input1;
        f2 = input2;
    }

    public String fight() {
        while(f1.hasHP() && f2.hasHP()) {
            f1.attack(f2);
            f2.attack(f1);
        }

        if(f1.hasHP())
            return f1.getName();

        return f2.getName();
    }

    public static void main(String[] args) {
        BoxingMatch match = new BoxingMatch(new Fighter("Johnny Joestar", 100, 20), new Fighter("Funny Valentine", 150, 10));
        String winner = match.fight();

        System.out.println("The winner of the match is: " + winner);
    }
}
