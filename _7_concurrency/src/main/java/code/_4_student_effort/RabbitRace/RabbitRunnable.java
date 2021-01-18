package code._4_student_effort.RabbitRace;

public class RabbitRunnable implements Runnable{
    int nr;
    public RabbitRunnable(int nr){
        this.nr = nr;
    }

    @Override
    public void run() {
        System.out.println("Rabbit"+nr+"is running");
    }
}
