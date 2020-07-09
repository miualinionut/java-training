package code._4_student_effort.Challenge2;

public class BankAccount {
    private String name;
    private int debit;

    public BankAccount(String name, int debit) {
        this.name = name;
        this.debit = debit;
    }

    public void withdraw(double amount) {
        longDataBaseCall();
        debit = debit - (int)amount;
    }

    public void deposit(double amount) {
        longDataBaseCall();
        debit = debit + (int)amount;
    }

    public void longDataBaseCall() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", debit=" + debit +
                '}';
    }
}
