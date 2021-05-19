package code._4_student_effort.CodeChallange1;

public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Fighter1", 150, 5);
        Fighter fighter2 = new Fighter("Fighter2", 100, 10);
        BoxingMatch match = new BoxingMatch(fighter1, fighter2);
        System.out.println("The winner is " + match.fight());
    }
}
