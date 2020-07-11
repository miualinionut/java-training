package code._4_student_effort;
public class BankTransactionsChallenge {
    public static void main(String[] args) throws InterruptedException {
        BankAccount b1 = new BankAccount("Daria",  200000);
        BankAccount b2 = new BankAccount("Bianca", 5000);
        TransactionThread t1 = new TransactionThread("t1",b1,b2, 500 );
        TransactionThread t2 = new TransactionThread("t2",b1,b2,1000);
        // incepera tranzactiei
        t1.start();
        t2.start();
        // asteptam sa fie completat transferul
        t1.join();
        t2.join();
        System.out.println(b1);
        System.out.println(b2);
    }
}
