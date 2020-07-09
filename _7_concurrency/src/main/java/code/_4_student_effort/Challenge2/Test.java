package code._4_student_effort.Challenge2;

public class Test {

    public static void main(String[] args) {
        BankAccount me = new BankAccount("me", 1200);
        BankAccount friend = new BankAccount("my friend", 800);

        TransactionThread t1 = new TransactionThread("t1",me,friend,100);
        TransactionThread t2 = new TransactionThread("t2",friend,me,300);
       // ThreadForDeadlock t3 = new ThreadForDeadlock("deadlock Thread",me, friend,100);
        // ar fi dedlock pentru ca in functia run am inversat ordinea in care sincronizam to si from

        t1.start();
        t2.start();
        //t3.start();


        try {
            t1.join();
            t2.join();
           // t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(me);
        System.out.println(friend);
    }
}
