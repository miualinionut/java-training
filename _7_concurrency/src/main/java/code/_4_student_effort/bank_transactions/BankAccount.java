package code._4_student_effort.bank_transactions;

public class BankAccount {
    private String name;
    private double debit;

    public BankAccount(String name, double debit) {
        this.name = name;
        this.debit = debit;
    }

    void withDraw(double amount) {
        longDatabaseCall();
        this.debit -= amount;
    }

    void deposit(double amount) {
        longDatabaseCall();
        this.debit += amount;
    }

    void longDatabaseCall() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Debit: " + debit;
    }
}
