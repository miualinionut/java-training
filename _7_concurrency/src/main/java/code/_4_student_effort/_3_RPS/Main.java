package code._4_student_effort._3_RPS;

import code._2_challenge._3_rock_paper_scissors.RockPaperScissorsChallenge;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Player p1 = new Player();
        Player p2 = new Player();

        //start
        p1.start();
        p2.start();

        //wait for then to finish
        p1.join();
        p2.join();

        displayWinner(p1, p2);
    }

    public static void displayWinner(Player p1, Player p2){
        String a1 = p1.getChoose();
        String a2 = p2.getChoose();

        if(a1.equals(a2)){
            System.out.println("Egalitate");
        } else if (
                a1.equals("paper") && a2.equals("rock") ||
                        a1.equals("rock") && a2.equals("scissors") ||
                        a1.equals("scissors") && a2.equals("paper")
        ) {
            System.out.println("P1 WINS");
        } else {
            System.out.println("P2 WINS");
        }
    }
}
