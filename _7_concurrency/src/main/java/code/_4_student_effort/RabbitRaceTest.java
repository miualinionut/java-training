package code._4_student_effort;

public class RabbitRaceTest {

    public static void main(String[] args) {
        RabbitRaceTest competition = new RabbitRaceTest();
        competition.createAndRacerace();
    }

    private void createAndRacerace() {
        for (int i = 0; i < 10; i++) {
            Thread r;
            if (i % 2 == 0) {
                r = new RabbitRaceThread(i);
            } else {
                RabbitRaceRunnable aux = new RabbitRaceRunnable(i);
                r = new Thread(aux);
            }
            r.start();
        }
    }


}
