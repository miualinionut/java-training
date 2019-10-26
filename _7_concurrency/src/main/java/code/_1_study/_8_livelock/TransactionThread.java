package code._1_study._8_livelock;

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
    boolean success;
    do {
      success = transferUsingLockObjects(from, to, amount);
    } while (!success); //wait for successful transfer

    if (success) {
      System.out.println("transfer " + from.name + " to " + to.name + " wih amount " + amount + " completed successfully");
    } else {
      System.out.println("transfer " + from.name + " to " + to.name + " wih amount " + amount + " not completed");
    }
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

}