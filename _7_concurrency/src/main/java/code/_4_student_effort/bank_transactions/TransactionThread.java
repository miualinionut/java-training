package code._4_student_effort.bank_transactions;

import java.util.concurrent.Semaphore;

public class TransactionThread extends Thread {
    private String name;
    private BankAccount from;
    private BankAccount to;
    private double amount;
    private Semaphore semaphore;

    public TransactionThread(String name, BankAccount from, BankAccount to, double amount, Semaphore semaphore) {
        this.name = name;
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        transfer(from, to, amount);
    }

    private void transfer(BankAccount from, BankAccount to, double amount) {
        try {
            semaphore.acquire();
            from.withDraw(amount);
            to.deposit(amount);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();
    }
}
