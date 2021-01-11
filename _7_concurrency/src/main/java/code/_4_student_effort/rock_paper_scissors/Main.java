package code._4_student_effort.rock_paper_scissors;

import java.util.concurrent.CyclicBarrier;

public class Main {
    public static final int NO_THREADS = 2;

    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier barrier = new CyclicBarrier(NO_THREADS);
        Player player1 = new Player(barrier, 0);
        Player player2 = new Player(barrier, 1);

        player1.start();
        player2.start();

        player1.join();
        player2.join();

        winner(player1, player2);
    }

    public static void winner(Player player1, Player player2) {
        if (player1.getOption().equals(player2.getOption())) {
            System.out.println("Equality");
        } else if (player1.getOption().equals("paper") && player2.getOption().equals("rock") ||
                   player1.getOption().equals("rock") && player2.getOption().equals("scissors") ||
                   player1.getOption().equals("scissors") && player2.getOption().equals("paper")) {
            System.out.println("WINNER: Player " + player1.getIdThread());
        } else {
            System.out.println("WINNER: Player " + player2.getIdThread());
        }
    }
}
