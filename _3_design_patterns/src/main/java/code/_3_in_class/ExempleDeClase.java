package code._3_in_class;

// Clasa simpla
// Clasa nested - clasa in clasa
// Clasa inner - clasa in instanta
// Clasa abstracta - ce nu pot fi instantiate, poate contine metode fara implementare asemenea interfetelor
// Clasa anonima - fara nume -> numele este generat de complilator ... 01, 02 ... n

interface MyInterface{
    void metoda();
}

abstract class ClasaAbstracta {
    abstract void metodaFaraImplementare();
    void metodaCuImplementare() {
        System.out.println("Fa ceva");
    }
}

class ClasaCuImplementareConcreta extends ClasaAbstracta {
    @Override
    void metodaFaraImplementare() {
        System.out.println("Metoda cu implementare concreta");
    }
}

public class ExempleDeClase {
    static class ClasaNested {
        static int nestedInt = 0;
    }

    class ClasaInner {
        int innerInt = 1;
    }

    class Implementare implements MyInterface {
        @Override
        public void metoda() {
            System.out.println("S-a apelat metoda din implementare");
        }
    }

    static int s;
    int i;

    public static void main(String[] args) {
        ExempleDeClase instanta = new ExempleDeClase();

        // Printez camp static
        System.out.println(ExempleDeClase.s);
        // Printez camp al instantei
        System.out.println(instanta.i);

        // Printez camp din clasa statica
        System.out.println(ClasaNested.nestedInt);

        //
        ClasaInner c = instanta.new ClasaInner(); // Echivalent cu ce face m()

        MyInterface contract = new MyInterface() { // Clasa anonima
            @Override
            public void metoda() {
                System.out.println("S-a apelat metoda din clasa anonima");
            }
        };
    }

    void m() {
        ClasaInner innerClassInstance = new ClasaInner();
    }
}
