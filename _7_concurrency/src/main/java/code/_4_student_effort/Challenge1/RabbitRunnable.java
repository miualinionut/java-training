package code._4_student_effort.Challenge1;

public class RabbitRunnable implements Runnable {

    private int nr;
    public RabbitRunnable(int n){
        nr = n;
    }

    @Override
    public void run() {
        System.out.println("Rabbit Runnable" + nr + " is running...");
    }
}
