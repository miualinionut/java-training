package code._4_student_effort;

public class BankTransactions {
    public static void main(String[] args) throws Exception {
        BankAccount JohnAccount = new BankAccount("John", 100_000);
        BankAccount MaryAccount = new BankAccount("Mary", 100);
        System.out.println("before:");
        System.out.println(JohnAccount);
        System.out.println(MaryAccount);

        TransactionThread t1 = new TransactionThread("T1", JohnAccount, MaryAccount, 10);
        TransactionThread t2 = new TransactionThread("T2", JohnAccount, MaryAccount, 100);


        t1.start();
        t2.start();


        t1.join();
        t2.join();

        System.out.println("after:");
        System.out.println(JohnAccount);
        System.out.println(MaryAccount);
    }
}
