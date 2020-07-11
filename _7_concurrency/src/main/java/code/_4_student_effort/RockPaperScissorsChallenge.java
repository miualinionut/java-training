package code._4_student_effort;
import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class RockPaperScissorsChallenge {
    public static void main(String[] args) throws InterruptedException {
        Player p1 = new Player();
        Player p2 = new Player();
        // start
        p1.start();
        p2.start();
        //asteptam sa termine
        p1.join();
        p2.join();

    }

    static void displayWinner(Player p1, Player p2) {
        String o1 = p1.opt;
        String o2 = p2.opt;
        if (o1.equals(o2)) {

            System.out.println(o1 + " vs " + o2 + " => EQUALITY");
        } else if (
                o1.equals("paper") && o2.equals("rock") ||
                        o1.equals("rock") && o2.equals("scissors") ||
                        o1.equals("scissors") && o2.equals("paper")
        ) {

            System.out.println(o1 + " vs" + o2 + " => PI WINS");
        }else {
            System.out.println(o1 + " vs " + o2 + " => P2 WINS");
        }
    }

    static class Player extends Thread {
        public String opt;

        public void run() {
            List<String> options = asList("paper", "scissors", "rock");
            opt = options.get(new Random().nextInt(3));
        }
    }
}
