package code._3_in_class;

public class Main {

    public static void main(String[] args) {
        Invatacel i1 = InvatacelFactory.make();
        Invatacel i2 = InvatacelFactory.make();

        Integer i = Integer.valueOf(args[0]);

        i1.invata();

    }

    public void doSomething(){
        Invatacel i = InvatacelFactory.make();
    }

    interface Invatacel {
        void invata();
    }

}