package clean.code.design_patterns.requirements;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;

class Roata {
    private static Roata inMiscare = null;
    public String s;

    private Roata() {
        s = "Roata este in miscare";
    }


    public static Roata getMiscare() {
        if (inMiscare == null) {
            System.out.println("Porneste roata");
            inMiscare = new Roata();
        }
        return inMiscare;
    }
}


public class Main {

    public static void main(String[] args) {
        //TODO implement your design patterns in this package
//singleton
        Roata prima = Roata.getMiscare();
        System.out.println(prima.s);

        //composite
        SUV SUV1 = new SUV(1, "Mazda CX-5");
        SUV SUV2 = new SUV(2, "Honda HR-V");
        Masina masinaSUV = new Masina();
        masinaSUV.adaugaMasina(SUV1);
        masinaSUV.adaugaMasina(SUV2);

        VAN VAN1 = new VAN(3, "Toyota Proace Verso");
        Masina masinaVAN = new Masina();
        masinaVAN.adaugaMasina(VAN1);
        Masina TOATE = new Masina();
        TOATE.adaugaMasina(masinaSUV);
        TOATE.adaugaMasina(masinaVAN);

        TOATE.printNumeMasina();

    }
}
