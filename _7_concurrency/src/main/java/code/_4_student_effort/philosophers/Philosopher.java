package code._4_student_effort.philosophers;

public class Philosopher implements Runnable{
    private Fork leftFork, rightFork;
    private int thread_id;

    public Philosopher(Fork leftFork, Fork rightFork, int thread_id) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.thread_id = thread_id;
    }

    private void sleep() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        if (thread_id == 0) {
            synchronized (leftFork) {
                sleep();
                synchronized (rightFork) {
                    System.out.println("Philosopher " + thread_id + " is eating");
                }
            }
        } else {
            synchronized (rightFork) {
                sleep();
                synchronized (leftFork) {
                    System.out.println("Philosopher " + thread_id + " is eating");
                }
            }
        }
    }
}
