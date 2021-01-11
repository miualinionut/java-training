package code._4_student_effort.bank_transactions;

import code._4_student_effort.rabbit_race.RabbitRunnable;
import code._4_student_effort.rabbit_race.RabbitThread;

import java.util.concurrent.Semaphore;

public class Main {
    public static final int NO_THREADS = 4;

    public static void main(String[] args) throws Exception{
        Thread[] threads = new Thread[NO_THREADS];
        BankAccount from = new BankAccount("Andreea", 100);
        BankAccount to = new BankAccount("Gabriel", 0);
        Semaphore semaphore = new Semaphore(1);

        // create threads
        for (int i = 0; i < NO_THREADS; i++) {
            threads[i] = new TransactionThread("BCR", from, to, 10, semaphore);
        }

        // start
        for (int i = 0; i < NO_THREADS; i++) {
            threads[i].start();
        }

        // join threads
        for (int i = 0; i < NO_THREADS; i++) {
            threads[i].join();
        }

        System.out.println(from.toString());
        System.out.println(to.toString()); // should print 40: 4 threads * 10 amount
    }
}
