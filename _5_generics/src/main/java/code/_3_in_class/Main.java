package code._3_in_class;

public class Main {

    public static void main(String[] args) {
        B b = new B();
        B<C> b2=new B<C>();
        C c2=b2.process(new C());

    }
}