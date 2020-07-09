package code._4_student_effort.Challenge1;

public class RabbitThread extends Thread {

    private int nr;
    public RabbitThread(int n){
        nr = n;
    }
    public void run(){

            System.out.println("Rabbit Thread "+ nr + " is running...");

    }
}
