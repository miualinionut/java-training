package code._3_in_class;
import java.util.Date;

public class Masina {
    // state
    String culoare;
    String marca;
    private int viteza;
    //primitivele sunt imutabile
    //ex:datele calendaristice sunt mutaile
    private Date dataFabricatie;

    //incapsulare
    public void overrideViteza(int v)
    {
        if(v>0)
        {
            if(v<50)
            {
                viteza=v;
            }
        }
    }

    public int getViteza()
    {
        return viteza;
    }

    public void setViteza(int v)
    {
        if(v>0&&v<50)
        {
            viteza=viteza;
        }
    }

    public Date getDataFabricatie()
    {
        return new Date(dataFabricatie.getTime());
        //return (Date) dataFabricatie.clone();
    }

    public void setDataFabricatie(Date dataFabricatie)
    {
        this.dataFabricatie=dataFabricatie;
    }

    //behaviour
    //PRINCIPII: clean code
      // DRY- don=t repeat yourself
    //INCAPSULARE
    //COHESION
    void start() {
        System.out.println("masina porneste");
        seteazaViteza(1);
    }
    void stop() {
        System.out.println("masina se opreste ");
        seteazaViteza(0);
    }
    void steer() {
        System.out.println("masina coteste");
        seteazaViteza(viteza-1);
    }
    void seteazaViteza(int v)
    {
        viteza=v;
    }


}
