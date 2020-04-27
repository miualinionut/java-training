package code._3_in_class;

public class masina {
    //state
    String culoare;
    String marca;
    int viteza;

    //behaviour
    void start() {
        System.out.println("masina porneste");
        seteazaViteza(1);
    }

    void stop() {
        System.out.println("masina se opreste");
        viteza = 0;
        seteazaViteza(0);
    }

    void steer() {
        System.out.println("masina coteste");
        seteazaViteza(viteza - 1);
    }

    void seteazaViteza(int v) {
        viteza = v;
    }
}
