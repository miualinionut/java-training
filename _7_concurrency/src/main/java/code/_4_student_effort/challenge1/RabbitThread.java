package code._4_student_effort.challenge1;

public class RabbitThread extends Thread {

    int nr;

    public RabbitThread(int nr){
        this.nr=nr;
    }

    public void run(){
        System.out.println("Rabbit "+this.nr+" is running.");
    }

}
