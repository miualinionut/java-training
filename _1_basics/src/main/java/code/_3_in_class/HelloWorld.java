package code._3_in_class;

import org.w3c.dom.ls.LSInput;

public class HelloWorld {
    static int s = 0;//variabila de clasa/statica
    int i;//variabila de instanta/non-statica

    public HelloWorld() {
        i = 1;
    }

    public static void main(String[] args) {
        int a = 0;
        HelloWorld h = new HelloWorld();
        h.i = 20;
        HelloWorld.s = 10;

    }
}
