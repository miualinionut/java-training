package code._4_student_effort.challenge1;

public class Challenge1Main {

    public static Thread addThreadRabbit(int nr){
        return new RabbitThread(nr);
    }

    public static Thread addRunnableRabbit(int nr){
        return new Thread(new RabbitRunnable(nr));
    }

    public static Thread align(int pos){

        if(pos%2==0) return addThreadRabbit(pos);
        return addRunnableRabbit(pos);

    }

    public static void run(Thread thread){
        thread.start();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread rabbits = align(i+1);
            run(rabbits);
        }
    }
}
