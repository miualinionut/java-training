package code._4_student_effort;
public class TransactionThread extends Thread {
    private String name;
    private BankAccount from;
    private BankAccount to;
    private int amount;

    public TransactionThread(String name, BankAccount from, BankAccount to, int amount) {
        super(name);
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public void run() {
        transfer(from, to, amount);

    }

    private boolean transfer(BankAccount from, BankAccount to, int amount) {
        boolean success = false;
        synchronized (from) {
            from.withdraw(amount);

            synchronized (to) {
                to.deposit(amount);
                success = true;
            }
        }
        return success;
    }
}

