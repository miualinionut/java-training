package code._3_in_class;

public class Quiz {
}

class Bird {
    {
        System.out.println("b1");
    }

    public Bird() {
        System.out.println("b2");
    }

}

class Raptor extends Bird {
    static {
        System.out.println("r1 ");
    }

    public Raptor() {
        System.out.println("r2 ");
    }

    {
        System.out.println("r3 ");
    }

    static {
        System.out.println("r4 ");
    }
}

class Hawk extends Raptor {
    public static void main(String[] args) {
        System.out.println("pre ");
        new Hawk();
        System.out.println("hawk ");
    }
}
// pasul 1: blocurile statice: r1 r4
// pasul 2: r1 r4 pre -> sout
// pasul 2: r1 r4 pre -> new
// pasul 3: r1 r4
