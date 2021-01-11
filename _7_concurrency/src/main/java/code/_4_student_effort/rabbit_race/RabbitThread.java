package code._4_student_effort.rabbit_race;

public class RabbitThread extends Thread implements Rabbit {
    private int id_rabbit;
    RabbitThread(int id) {
        this.id_rabbit = id;
    }

    public int getIdRabbit() {
        return id_rabbit;
    }

    @Override
    public void run() {
        System.out.println("Rabbit " + getIdRabbit() + " is running from RabbitThread");
    }
}
