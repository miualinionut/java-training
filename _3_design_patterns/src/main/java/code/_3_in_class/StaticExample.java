package code._3_in_class;

public class StaticExample {
    static final int altaVariabila = 0; // will postpone for now
    static int iStaticSauVariabilaDeClasa = 0; // keyword static -> ne lasa posibilitatea de schimbarea unei variabile
    int iInstantaSauVariabilaDeInstanta = 0;

    public static void main(String[] args) {
        StaticExample i1 = new StaticExample();
        StaticExample i2 = new StaticExample();
        StaticExample i3 = new StaticExample();

        i1.iStaticSauVariabilaDeClasa = 1;
        i2.iInstantaSauVariabilaDeInstanta = 2;
        i3.iInstantaSauVariabilaDeInstanta = 3;
        System.out.println("i1.iStatic =" + i1.iInstantaSauVariabilaDeInstanta);
        System.out.println("i2.iInstanta =" + i2.iInstantaSauVariabilaDeInstanta);
        System.out.println("i3.iInstanta=" + i3.iInstantaSauVariabilaDeInstanta);

    }

    static void m() {
        System.out.println("static method");
    }

    void m2() {
        System.out.println("m2");
    }


    }
