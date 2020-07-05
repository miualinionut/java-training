package code._4_student_effort;

public class RabbitRaceRunnable implements Runnable {
    int nr;
    public RabbitRaceRunnable(int nr) {
        this.nr = nr;
    }

    @Override
    public void run() {
        System.out.println("Rabbit nr " + nr + " is running");
    }
}
