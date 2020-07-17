package code._4_student_effort.challenge2;

import code._2_challenge._2_bank_transactions.BankAccount;
import code._2_challenge._2_bank_transactions.TransactionThread;

public class Challenge2Main {
    public static void main(String[] args) throws Exception {
        code._2_challenge._2_bank_transactions.BankAccount momAccount = new code._2_challenge._2_bank_transactions.BankAccount("mom", 100_000);
        code._2_challenge._2_bank_transactions.BankAccount myAccount = new BankAccount("me", 100);
        System.out.println("before:");
        System.out.println(momAccount);
        System.out.println(myAccount);

        code._2_challenge._2_bank_transactions.TransactionThread t1 = new code._2_challenge._2_bank_transactions.TransactionThread("T1", momAccount, myAccount, 10);
        code._2_challenge._2_bank_transactions.TransactionThread t2 = new TransactionThread("T2", momAccount, myAccount, 100);

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
