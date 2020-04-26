package code._3_in_class;

import java.util.Date;

public class Masina {

    String marca;
    String culoare;
    int viteza;
    private Date dataFabricatie;



    public int getViteza() {
        return viteza;
    }

    public void setViteza(int v) {
        if(v>0 && v<50){
            viteza=v;
        }
    }
    public Date getDataFabricatie() {
        return new Date(dataFabricatie.getTime());
        //return (Date) dataFabricatie.clone();
    }

    public void setDataFabricatie(Date dataFabricatie) {
        this.dataFabricatie = dataFabricatie;
    }
    void start(){
        System.out.println("Masina porneste");
        seteazaViteza(1);
    }



    private void seteazaViteza(int i) {
        viteza=i;
    }

    void stop(){
        System.out.println("Masina se opreste");
        seteazaViteza(0);
    }
    void steer(){
        System.out.println("Masina coteste");
        seteazaViteza(viteza-1);
    }

}
