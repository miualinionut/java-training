package code._4_student_effort.Challenge2;

public class TransactionThread extends Thread {
    private String name;
    private BankAccount from, to;
    int amount;

    public TransactionThread(String name, BankAccount from, BankAccount to, int amount){
        this.name = name;
        this.to = to;
        this.from = from;
        this.amount = amount;
    }

    @Override
    public void run() {
        transfer(from,to,amount);
    }

    private void transfer(BankAccount from, BankAccount to, int amount){
        synchronized (this){
            from.withdraw(amount);
            to.deposit(amount);
        }

//        synchronized (from){
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            synchronized (to){
//                from.withdraw(amount);
//                to.deposit(amount);
//            }
//        }
//
    }
}
