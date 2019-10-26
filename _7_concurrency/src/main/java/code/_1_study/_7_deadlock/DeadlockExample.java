package code._1_study._7_deadlock;

public class DeadlockExample {

  //observe in visual vm the blocked threads using the command from below:
  //C:\development\tools\visualvm_142\bin>visualvm.exe --jdkhome %JAVA_HOME%

  public static void main(String[] args) throws Exception {
    BankAccount momAccount = new BankAccount("mom", 100_000);
    BankAccount myAccount = new BankAccount("me", 100);
    System.out.println("before:");
    System.out.println(momAccount);
    System.out.println(myAccount);

    //locks will be acquired in reverse order by the threads resulting in deadlock because each thread will hold on his own resource and never release it while waiting for the other thread to release his resource (will never happen)
    TransactionThread t1 = new TransactionThread("T1", momAccount, myAccount, 100);
    TransactionThread t2 = new TransactionThread("T2", myAccount, momAccount, 100);

    //start transacting
    t1.start();
    t2.start();

    //wait for transfers to be completed
    t1.join();
    t2.join();

    System.out.println("after:");
    System.out.println(momAccount);
    System.out.println(myAccount);
  }
}
