package code._4_student_effort;

public class RabbitRaceThread extends Thread {
    int nr;

    public RabbitRaceThread(int nr) {
        this.nr = nr;
    }

    @Override
    public void run() {
        System.out.println("Rabbit nr " + nr + " is running");
    }
}
