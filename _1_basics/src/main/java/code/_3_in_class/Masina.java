package code._3_in_class;

import java.util.Date;

public class Masina {

    String culoare;
    String marca;
    private int viteza;
    private Date data_fabricatie;


    public Date getData_fabricatie() {
        return  new Date(data_fabricatie.getTime());
    }

    public void setData_fabricatie(Date data_fabricatie) {
        this.data_fabricatie = data_fabricatie;
    }

    public int getViteza() {
        return viteza;
    }

    public void setViteza(int v) {
        if (v > 0 && v < 50) {
            this.viteza = v;
        }
    }

    public void start(){
        System.out.println("porneste");
        seteazaViteza(1);
    }

    private void seteazaViteza(int i) {
        viteza = i;
    }

    public void stop(){
        System.out.println("se opreste");
        seteazaViteza(0);
    }

    public void steer(){
        System.out.println("coteste");
        seteazaViteza(viteza-1);
    }

}
