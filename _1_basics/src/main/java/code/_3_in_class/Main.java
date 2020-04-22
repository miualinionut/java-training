package code._3_in_class;

public class Main{
    public static void main(String[] args){
        //primitive:
        //numere
        //caractere
        //boolean

        //referinte/obiecte
        //este o colectie/grup/gramada de primitive

        Masina m=new Masina();
        m.start();
        m.steer();
        m.stop();
        Date d=m.getDataFabricatie();
        d.setYear(1800);

    }
}