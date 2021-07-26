package code._4_student_effort.CodeChallange2;

public class TransactionThread extends Thread{
    private String name;
    private BankAccount from;
    private BankAccount to;
    private int amount;

    public TransactionThread(String name, BankAccount from, BankAccount to, int amount){
        this.name = name;
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    @Override
    public void run(){
        transfer(this.from, this.to, this.amount);
    }

    private void transfer(BankAccount from, BankAccount to, int amount){
        boolean success = false;
        synchronized(from){
            from.withdraw(amount);
            synchronized(to){
                to.deposit(amount);
                success = true;
            }
        }
        if(success){
            System.out.println("Transfer successful for debit=" + amount);
        }
        else {
            System.out.println("Transfer failed for debit=" + amount);
        }
    }
}
