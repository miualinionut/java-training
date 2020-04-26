package code._3_in_class;

import java.util.Date;

public class Masina {
    //state
    String culoare;
    String marca;
    private int viteza;
    //primitivele sunt imutabile
    //ex: datele calendaristice sunt mutabile;

    private Date dataFabricatie;

    //incapsulare
    public int getViteza() {
        return viteza;
    }

    public void setViteza(int viteza) {
        if (viteza > 0 && viteza < 50){
            this.viteza = viteza;
        }
    }

    public Date getDataFabricatie() {
        return (Date)dataFabricatie.clone();
    }

    public void setDataFabricatie(Date dataFabricatie) {
        this.dataFabricatie = dataFabricatie;
    }

    //behaviour
    //PINCIPII: clean code
        //DRY - don't repeat yourself
        //INCAPSULARE
        //COHESION
    void start() {
        System.out.println("masina porneste");
        seteazaViteza(1);
    }
    void stop() {
        System.out.println("masina se opreste");
        seteazaViteza(0);
    }
    void steer() {
        System.out.println("masina coteste");
        seteazaViteza(viteza - 1);
    }

    private void seteazaViteza(int i) {
        viteza = i;
    }
}
