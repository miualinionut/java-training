package code._4_student_effort.Challenge2;

public class ThreadForDeadlock extends Thread {

    private String name;
    private BankAccount from, to;
    int amount;

    public ThreadForDeadlock(String name, BankAccount from, BankAccount to, int amount) {
        this.to = to;
        this.from = from;
        this.name = name;
        this.amount = amount;
    }

    @Override
    public void run() {
        transfer(from, to, amount);
    }

    private void transfer(BankAccount from, BankAccount to, int amount) {
        synchronized (to){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (from){
                from.withdraw(amount);
                to.deposit(amount);
            }
        }
    }
}
