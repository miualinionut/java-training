package code._3_in_class;

import java.util.Date;

public class Masina{
    //state
    String culoare;
    String marca;
    public int viteza;
    private Date dataFabricatie;

    //incapsulare
    public int getViteza(){
        return viteza;
    }

    public void setViteza(int v){
        if(v>0 && v<50)
            viteza=v;
    }

    public void overrideViteza(int v){
        if(v>0 && v<50){
            viteza=v;
        }
    }

    public void setDataFabricatie(Date dataDeFabricare){
        this.dataFabricatie=dataDeFabricare;
    }
    public Date getDataFabricatie(){
        return new Date(dataFabricatie.getTime());
    }
    //behaviour
    //PRINCIPII: clean code
    //DRY-don't repeat your self
    void start(){
        System.out.println("masina porneste");
        seteazaViteza(1);
    }
    void stop(){
        System.out.println("masina se opreste");
        seteazaViteza(0);
    }
    void steer(){
        System.out.println("masina coteste");
        seteazaViteza(viteza-1);
    }
    void seteazaViteza(int i){
        viteza=i;
    }
}