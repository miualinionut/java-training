package code._3_in_class;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread t1=new Thread(new T1());
        Thread t2=new Thread(new T2());

        t1.start();
        t2.start();




    }
}