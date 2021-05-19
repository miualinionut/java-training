package code._4_student_effort._1_two_fighters_one_winner;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Fighter 1", 10);
        Fighter f2 = new Fighter("Fighter 2", 20);
        BoxingMatch boxingMatch = new BoxingMatch(f1, f2);
        System.out.println("The winner is: " + boxingMatch.fight());
    }
}
