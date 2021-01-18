package code._4_student_effort.RabbitRace;

public class RabbitRace {
    public static void main(String[] args) {
        rabbitRace();
    }

    public static Thread createRabbitRunnable(int nr){
        RabbitRunnable runnable = new RabbitRunnable(nr);
        return new Thread(runnable);
    }

    public static Thread createRabbitThread(int nr) {
        return new RabbitThread(nr);
    }

    public static Thread alignRabbits(int position){
        if(position%2==0){
            return createRabbitThread(position);
        }
        return createRabbitRunnable(position);
    }

    public static void run(Thread rabbit){
        rabbit.start();
    }

    public static void rabbitRace(){
        for (int i=1; i<=10;i++){
            Thread rabbit = alignRabbits(i);
           run(rabbit);
        }
    }
}
