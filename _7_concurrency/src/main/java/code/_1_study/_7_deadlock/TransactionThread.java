package code._1_study._7_deadlock;

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
    //both methods from below will generate deadlock

    transferUsingLockObjects(from, to, amount);
    //transferUsingIntrinsicLocks(from, to, amount);
  }

  private boolean transferUsingLockObjects(BankAccount from, BankAccount to, int amount) {
    boolean success = false;

    if (from.lock()) {
      from.withdraw(amount); //because we pause work here, other threads have a chance to get lock on the other obj

      if (to.lock()) {
        to.deposit(amount); //because we pause work here, other threads have a chance to get lock on the other obj
        to.unlock();
        success = true;
      }

      if (!success) from.deposit(amount); //in the case deposit was not successful, then we put the money back
      from.unlock();
    }

    return success;
  }

  private boolean transferUsingIntrinsicLocks(BankAccount from, BankAccount to, int amount) {
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