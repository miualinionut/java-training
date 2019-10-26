package code._1_study._5_intrinsic_locks;

public class TransactionThread extends Thread {
  private BankAccount from;
  private BankAccount to;
  private int amount;

  public TransactionThread(String name, BankAccount from, BankAccount to, int amount) {
    super(name);
    this.from = from;
    this.to = to;
    this.amount = amount;
  }

  @Override
  public void run() {
    transfer(from, to, amount);
  }

  private boolean transfer(BankAccount from, BankAccount to, int amount) {
    boolean success = false;
    synchronized (from) { //locking on intrinsic lock of 'from' Object
      from.withdraw(amount);
      synchronized (to) { //locking on intrinsic lock of 'to' Object
        to.deposit(amount);
        success = true;
      }
    }
    return success;
  }
}