package code._4_student_effort.challenge2;

public class TransactionThread extends Thread {

    private String name;
    private BankAccount source;
    private BankAccount destination;
    private int amount;


    public TransactionThread(String name, BankAccount from, BankAccount to, int amount) {
        //TODO your implementation here
        this.name=name;
        this.source=from;
        this.destination=to;
        this.amount=amount;
    }

    @Override
    public void run() {
        //TODO your implementation here
        transfer(source,destination,amount);
    }

    private void transfer(BankAccount from, BankAccount to, int amount) {
        //TODO your implementation here
        synchronized (from){
            from.withdraw(amount);
            synchronized (to){
                to.deposit(amount);

            }
        }
    }
}
