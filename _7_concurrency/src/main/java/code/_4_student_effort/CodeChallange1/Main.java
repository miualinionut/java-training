package code._4_student_effort.CodeChallange1;

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            Thread rabbit = (i % 2 == 0) ? new RabbitThread(i) : new Thread(new RabbitRunnable(i));
            rabbit.start();
        }
    }
}
