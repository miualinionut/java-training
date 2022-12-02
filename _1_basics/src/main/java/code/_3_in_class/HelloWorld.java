package code._3_in_class;

import org.w3c.dom.ls.LSOutput;

public class HelloWorld {
    static int s = 1; // variabila de clasa statica
    int i = 2; // variabila de instanta non-statica
    public HelloWorld(){
        int i= 2;
    }

    public static void main(String[] args) {


        int a = 0;
        HelloWorld h;
        h = new HelloWorld();
        System.out.println("Inainte de modificare h2.s = " +h.s);
        h.i = 20;
        HelloWorld.s = 10;
        System.out.println("Dupa modificare h2.s = " +h.s);
        HelloWorld h2 = new HelloWorld();
        System.out.println("h2.i = "+h2.i);
        System.out.println("h2.s = "+h2.s);
        System.out.println(a);
        System.out.println(a++);
        System.out.println(++a);
        ;
    }
}