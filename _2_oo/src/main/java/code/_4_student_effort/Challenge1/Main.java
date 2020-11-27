package code._4_student_effort.Challenge1;

public class Main {

    public static void main(String[] args) {
        String winner;
        Fighter PlayerOne = new Fighter("Player1", 100, 20);
        Fighter PlayerTwo = new Fighter("Player2", 100, 10);


        PlayerOne.Player();
        PlayerTwo.Player();

        BoxingMatch box1 = new BoxingMatch(PlayerOne, PlayerTwo);
        winner = box1.fight();
        System.out.println(winner);




    }
}