package code._4_student_effort.two_fighters_one_winner;

public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Fighter1", 100.2, 10.1);
        Fighter fighter2 = new Fighter("Fighter2", 110.5, 9.2);
        BoxingMatch match = new BoxingMatch(fighter1, fighter2);
        String winner = match.fight();
        System.out.println(winner);
    }
}
