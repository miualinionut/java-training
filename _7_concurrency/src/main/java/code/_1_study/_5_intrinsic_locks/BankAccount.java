package code._1_study._5_intrinsic_locks;

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

  private void simulateLongDatabaseCall() {
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