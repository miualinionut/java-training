package code._4_student_effort;
public class BankAccount {
    private String name;
    private int debit;

    public BankAccount(String name, int debit) {
        this.name = name;
        this.debit = debit;
    }

    void withdraw(double amount) {
        simulateLongDatabaseCall();
        this.debit -= amount;
    }

    void deposit(double amount) {
        simulateLongDatabaseCall();
        this.debit += amount;
    }

    void simulateLongDatabaseCall() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String toString() {
        return "BankAccount{" +
                "name=' " + name + '\'' +
                ", debit=" + debit + '}';
    }
}
