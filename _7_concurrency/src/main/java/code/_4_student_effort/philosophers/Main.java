package code._4_student_effort.philosophers;

public class Main {
    public static final int NO_THREADS = 5;

    public static void main(String[] args) {
        Thread philosophers[] = new Thread[NO_THREADS];
        Fork forks[] = new Fork[NO_THREADS];

        for (int i = 0; i < NO_THREADS; i++) {
            forks[i] = new Fork();
        }

        for (int i = 0; i < NO_THREADS; i++) {
            philosophers[i] = new Thread(new Philosopher(forks[i], forks[(i + 1) % NO_THREADS], i));
        }

        for (int i = 0; i < NO_THREADS; i++) {
            philosophers[i].start();
        }

        for (int i = 0; i < NO_THREADS; i++) {
            try {
                philosophers[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
