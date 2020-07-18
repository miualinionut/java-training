package code._4_student_effort;


public class RabbitRace
        public static void main(String[] args) {
            RabbitRace challenge = new RabbitRace();
            challenge.race();
        }

        public Thread createThread(int i) {
            return new RabbitThread(i);
        }

        public Thread createRunnable(int i) {
            RabbitRunnable runnable = new RabbitRunnable(i);
            return new Thread(runnable);
        }

        public Thread getPos(int startPosition) {
            return (startPosition % 2 == 0) ?
                    createThread(startPosition) :
                    createRunnable(startPosition);
        }

        public void makeTheRabbitRun(Thread rabbit) {
            rabbit.start();
        }

        public void race() {
            for (int i = 0; i < 10; i++) {
                Thread rabbit = getPos(i);
                makeTheRabbitRun(rabbit);
            }
        }
