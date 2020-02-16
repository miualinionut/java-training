package code._4_student_effort.TwoFightersOneWinner;

public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Dani", 60,15);
        Fighter fighter2 = new Fighter("Alex", 50, 25);
        BoxingMatch boxingMatch = new BoxingMatch(fighter1, fighter2);
        boxingMatch.fight();
    }
}
