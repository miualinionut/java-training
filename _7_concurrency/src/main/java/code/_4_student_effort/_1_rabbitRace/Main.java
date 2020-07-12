package code._4_student_effort._1_rabbitRace;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.race();
    }

    public Thread createThread(int i ){
        return new RabbitThread(i);
    }

    public Thread createRunnable(int i){
        RabbitRunnable rabbitRunnable = new RabbitRunnable(i);
        return new Thread(rabbitRunnable);
    }

    public Thread startPosition(int start){
        if(start % 2 == 0){
            return createThread(start);
        } else {
            return createRunnable(start);
        }
    }

    public void run(Thread rabbit){
        rabbit.start();
    }

    public void race() {
        for (int i = 0; i < 10; i++) {
            Thread rabbit = startPosition(i);
            run(rabbit);
        }
    }
}
