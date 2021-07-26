package code._4_student_effort.CodeChallange1;

public class RabbitThread extends Thread{
    private int nr;

    public RabbitThread(int nr){
        this.nr = nr;
    }

    public void run(){
        System.out.printf("Rabbit %s is running \n", this.nr);
    }
}
