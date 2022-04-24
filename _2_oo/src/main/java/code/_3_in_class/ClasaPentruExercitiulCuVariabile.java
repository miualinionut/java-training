package code._3_in_class;

//cerinta
//1. defineste variabila de clasa
//2. defineste variabila de instanta
//3. defineste variabila locala

public class ClasaPentruExercitiulCuVariabile {
    static int variabilaDeClasa = 10;

    public static int getVariabilaDeClasa() {
        return variabilaDeClasa;
    }

    int variabilaDeInstanta = 11;

    public static void main(String[] args){
        int variabilaLocala = 12;
        System.out.println(variabilaLocala);
        System.out.println(getVariabilaDeClasa());

        ClasaPentruExercitiulCuVariabile instanta01 = new ClasaPentruExercitiulCuVariabile();
        ClasaPentruExercitiulCuVariabile instanta02 = new ClasaPentruExercitiulCuVariabile();

        instanta01.variabilaDeInstanta = 1123;
        instanta02.variabilaDeInstanta = 2345;
        // instanta01.variabilaDeClasa = 9999;

        System.out.println(instanta01.variabilaDeInstanta);
        System.out.println(instanta02.variabilaDeInstanta);
        System.out.println("-----------------------");
        // System.out.println(instanta01.variabilaDeClasa);
        // System.out.println(instanta02.variabilaDeClasa);
    }
}
