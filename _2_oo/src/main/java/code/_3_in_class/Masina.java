package code._3_in_class;

import java.util.Date;

public class Masina {
    String culoare;
    String marca;
    private int viteza;
    private Date dataDeFabricare;

    //incapsulare
    public int getViteza() {
        return viteza;
    }

    public void setViteza(int v) {
        if (v > 0 && v < 50)
            viteza = v;
    }

    public void setDataDeFabricare(Date dataDeFabricare) {
        this.dataDeFabricare = dataDeFabricare;
    }

    public Date getDataDeFrabricare() {
        return new Date(dataDeFabricare.getTime());
    }

    void start() {
        System.out.println("porneste masina");
        seteazaViteza(1);
    }

    void stop() {
        System.out.println("opreste masina");
        seteazaViteza(0);
    }

    void steer() {
        System.out.println("masina coteste");
        seteazaViteza(-1);
    }


    private void seteazaViteza(int i) {
        viteza = i;
    }
}
