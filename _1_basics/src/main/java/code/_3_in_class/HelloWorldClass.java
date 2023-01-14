package code._3_in_class;

import code._1_study._1_hello_world.HelloWorld;

public class HelloWorldClass {
    static int s = 1;
    int i = 2;

    public static void main(String[] args) {
        int a = 0;
        HelloWorld h = new HelloWorld();
        h.i = 20;

        System.out.println("inainte de modificare: h.s " + h.s);
        HelloWorld.s =10;
        System.out.println("dupa modificare: h.s " + h.s);

        HelloWorld h2 = new HelloWorld();
        System.out.println("h2.i=" + h2.i);
        System.out.println("h2.s=" + h2.s);

    }
}
