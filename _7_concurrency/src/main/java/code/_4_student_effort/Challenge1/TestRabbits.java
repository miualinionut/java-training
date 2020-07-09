package code._4_student_effort.Challenge1;

public class TestRabbits {
    public static void main(String[] args) {

        RabbitThread r1 = new RabbitThread(1);
        RabbitThread r2 = new RabbitThread(2);
        RabbitThread r3 = new RabbitThread(3);
        RabbitThread r4 = new RabbitThread(4);
        RabbitThread r5 = new RabbitThread(5);

        Thread rr1 = new Thread(new RabbitRunnable(1));
        Thread rr2 = new Thread(new RabbitRunnable(2));
        Thread rr3 = new Thread(new RabbitRunnable(3));
        Thread rr4 = new Thread(new RabbitRunnable(4));
        Thread rr5 = new Thread(new RabbitRunnable(5));

        r1.start();
        r2.start();
        r3.start();
        r4.start();
        r5.start();

        rr1.start();
        rr2.start();
        rr3.start();
        rr4.start();
        rr5.start();

        try {
            r1.join();
            r2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Cursa e gata");

    }
}
