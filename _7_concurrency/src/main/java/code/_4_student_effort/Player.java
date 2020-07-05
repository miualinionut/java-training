package code._4_student_effort;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class Player extends Thread {
    List<String> states = asList("PAPER", "SCISSORS", "ROCK");

    @Override
    public void run() {
        super.run();
    }

    public String getOption() {
        return states.get(new Random().nextInt(states.size()));
    }

    public static void play(Player p1, Player p2) {
        String option1 = p1.getOption();
        String option2 = p2.getOption();

        if (option1.equals(option2)) {
            System.out.println(option1 + " = " + option2);
        } else if (option1.equals("PAPER") && option2.equals("ROCK") ||
                option1.equals("ROCK") && option2.equals("SCISSORS") ||
                option1.equals("SCISSORS") && option2.equals("PAPER")) {
            System.out.println(option1 + " vs " + option2 + " Player1 wins");
        } else {
            System.out.println(option1 + " vs " + option2 + " Player2 wins");
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Player player1 = new Player();
        Player player2 = new Player();

        player1.start();
        player2.start();

        player1.join();
        player1.join();

        play(player1, player2);
    }
}
