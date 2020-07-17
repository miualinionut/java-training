package code._4_student_effort.challenge2;

public class BankAccount {

    private String name;
    private int debit;

    public BankAccount(String name, int debit) {
        //TODO your implementation here
        this.name=name;
        this.debit=debit;
    }

    void withdraw(double amount) {
        longDatabaseCall();
        //TODO your implementation here
        this.debit-=amount;

    }

    void deposit(double amount) {
        longDatabaseCall();
        //TODO your implementation here
        this.debit+=amount;

    }

    void longDatabaseCall() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
