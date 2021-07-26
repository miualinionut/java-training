package code._4_student_effort.CodeChallange2;

public class BankAccount {
    private String name;
    private int debit;

    public BankAccount(String name, int debit){
        this.name = name;
        this.debit = debit;
    }

    public void withdraw(double amount){
        longDatabaseCall();
        this.debit -= amount;
    }

    public void deposit(double amount){
        longDatabaseCall();
        this.debit += amount;
    }

    private void longDatabaseCall(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" + "name=" + name  + ", debit=" + debit + '}';
    }
}
