package code._3_in_class;

import java.util.Date;

public class Masina {
    String culoare, marca;
    int viteza;
    private Date dataFabricatie;

    public Date getDataFabricatie() {
        return (Date) dataFabricatie.clone();
    }

    public void setDataFabricatie(Date dataFabricatie) {
        this.dataFabricatie = dataFabricatie;
    }

    public int getViteza() {
        return viteza;
    }

    public void setViteza(int viteza) {
        if (viteza > 0 && viteza < 50) {
            this.viteza = viteza;
        }
    }

    public void overrideViteza(int v) {
        if (v > 0 && v < 50) {
            viteza = v;
        }
    }

    void start(){
        System.out.println("Masina porneste");
        seteazaViteza(1);
    }

    void stop(){
        System.out.println("Masina se opreste");
        seteazaViteza(0);
    }

    void steer(){
        System.out.println("Masina coteste");
        seteazaViteza(viteza - 1);
    }

    private void seteazaViteza(int i) {
        viteza = i;
    }
}
