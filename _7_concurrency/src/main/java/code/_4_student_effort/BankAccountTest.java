package code._4_student_effort;

public class BankAccountTest {

    public static void main(String[] args) throws InterruptedException {

        BankAccount b1 = new BankAccount("Account1", 1000);
        BankAccount b2 = new BankAccount("Account2", 200);

        TransactionThread t1 = new TransactionThread("t1", b1, b2, 100);
        TransactionThread t2 = new TransactionThread("t2", b1, b2, 600);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(b1);
        System.out.println(b2);

    }
}
