package code._4_student_effort.rabbit_race;

public class Main {
    public static final int NO_THREADS = 10;

    public static void main(String[] args) throws Exception{
        Thread[] rabbits = new Thread[NO_THREADS];

        // create threads
        for (int i = 0; i < NO_THREADS; i++) {
            if (i % 2 == 0) {
                rabbits[i] = new Thread(new RabbitRunnable(i));
            } else {
                rabbits[i] = new RabbitThread(i);
            }
        }

        for (int i = 0; i < NO_THREADS; i++) {
            rabbits[i].start();
        }

        // join threads
        for (int i = 0; i < NO_THREADS; i++) {
            rabbits[i].join();
        }
    }
}
