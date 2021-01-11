package code._4_student_effort.rabbit_race;

public class RabbitRunnable implements Runnable, Rabbit {
    private int id_rabbit;
    RabbitRunnable(int id) {
        this.id_rabbit = id;
    }

    public int getIdRabbit() {
        return id_rabbit;
    }

    @Override
    public void run() {
        System.out.println("Rabbit " + getIdRabbit() + " is running from RabbitRunnable");
    }
}
