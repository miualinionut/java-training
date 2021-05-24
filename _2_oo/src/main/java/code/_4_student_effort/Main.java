package code._4_student_effort;

public class Main {

    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Canelo");
        Fighter fighter2= new Fighter("Floyd");

        BoxingMatch boxingMatch = new BoxingMatch(fighter1,fighter2);

        boxingMatch.fight(fighter1,fighter2);
    }
}
