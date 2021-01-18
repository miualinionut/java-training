package code._4_student_effort.RabbitRace;

public class RabbitThread extends Thread{
    int nr;
    public RabbitThread(int nr){
        this.nr = nr;
    }

    @Override
    public void run(){
        System.out.println("Rabbit"+nr+"is running");
    }
}
