package code._3_in_class;

public class Masina {
    //state
    String culoare;
    String marca;
    private int viteza;
    //primitivele sunt imutabile
    //datele clenderistice sunt mutabile

    //behaviour
    //PRINCIPII
        //DRY - don't repeat yourself
        //INCAPSULARE
        //COHESION - sparg in multe clase
    public void overrideViteza(int v){
        if(v > 0 && v < 50){
            viteza = v;
        }
    }
    //getter si setter - accesez indirect viteza daca e private
    void start(){
        System.out.println("masina porneste");
        //viteza = 1;
        // pot sa fac o metoda ca sa nu ma mai repet
        seteazaViteza(1);
    };
    void stop(){
        System.out.println("masina opreste");
        viteza = 0;
    };
    void steer(){
        System.out.println("masina coteste");
        viteza = viteza - 1;
    };
    private void seteazaViteza(int v){
        viteza = v;
    }
}
