package code._1_study._7_deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
  private String name;
  private int debit;
  private Lock lock = new ReentrantLock(true);

  public BankAccount(String name, int debit) {
    this.name = name;
    this.debit = debit;
  }

  public boolean lock() {
    lock.lock(); //can result in deadlock
    return true;
    //return lock.tryLock(); //can result in livelock
  }

  public void unlock() {
    lock.unlock();
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