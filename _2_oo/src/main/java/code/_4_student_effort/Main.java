package code._4_student_effort;

public class Main {

    public static void main(String[] args) {

        Fighter f1 = new Fighter("Player 1",100,5);
        Fighter f2 = new Fighter("Player 2",100,5);

        BoxingMatch game = new BoxingMatch(f1,f2);
        System.out.println("The winner is " + game.fight());

    }
}
