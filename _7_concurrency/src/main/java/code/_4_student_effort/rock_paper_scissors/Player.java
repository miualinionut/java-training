package code._4_student_effort.rock_paper_scissors;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Player extends Thread {
    private List<String> choices;
    private CyclicBarrier barrier;
    private int idThread;
    private String option;

    public Player(CyclicBarrier barrier, int idThread) {
        choices = new ArrayList<>();
        choices.add("rock");
        choices.add("paper");
        choices.add("scissors");
        this.barrier = barrier;
        this.idThread = idThread;

    }

    @Override
    public void run() {
        int threadChoice = new Random().nextInt(choices.size());
        option = choices.get(threadChoice);
        try {
            barrier.await();
        } catch (BrokenBarrierException | InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Player " + idThread + " -> " + choices.get(threadChoice));
    }

    public int getIdThread() {
        return idThread;
    }

    public String getOption() {
        return option;
    }
}
