package code._3_in_class;

import javax.xml.crypto.Data;
import java.util.Date;

//obiect declarat de mine
public class Masina {

    //state
    String culoare;
    String marca;
    private int viteza;
    //primitivele sunt imutabile
    //ex: datele calendaristice
    private Date dataFabricatie;

    Masina() {}

    Masina(String culoare, String marca, int viteza) {
        this.culoare = culoare;
        this.marca = marca;
        this.viteza = viteza;
    }

    public void overrideViteza(int v) {
        if (v > 0 && v < 50) {
            viteza = v;
        }
    }

    public int getViteza() {
        return viteza;
    }

    public void setViteza(int viteza) {
        this.viteza = viteza;
    }

    public Date getDataFabricatie() {
        return new Date(dataFabricatie.getTime());
}

    public void setDataFabricatie(Date dataFabricatie) {
        this.dataFabricatie = dataFabricatie;
    }

    public String getCuloare() {
        return culoare;
    }


    //behavior
    // PRINCIPII: clean code
        //DRY - don't repeat your self
        //INCAPSULARE

    void start() {
        System.out.println("masina porneste");
        viteza = 1;
        seteazaViteza(1);
    }

    void stop() {
        System.out.println("masina se opreste");
        seteazaViteza(0);
    }

    void steer() {
        System.out.println("masina coteste");
        seteazaViteza(viteza = viteza - 1);
    }

    private void seteazaViteza(int i) {
        viteza = i;
    }

}
