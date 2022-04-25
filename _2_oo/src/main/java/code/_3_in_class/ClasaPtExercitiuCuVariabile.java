package code._3_in_class;

public class ClasaPtExercitiuCuVariabile {
    static int variabilaDeClasa  = 10;
    int variabilaDeInstanta = 11;

    public static void main(String[] args) {
        int variabilaLocala = 12;

        ClasaPtExercitiuCuVariabile instanta01 = new ClasaPtExercitiuCuVariabile();
        ClasaPtExercitiuCuVariabile instanta02 = new ClasaPtExercitiuCuVariabile();

        instanta01.variabilaDeInstanta = 1177;
        instanta01.variabilaDeClasa = 999;

        System.out.println(instanta01.variabilaDeInstanta);
        System.out.println(instanta02.variabilaDeInstanta);
        System.out.println("----------------");
        System.out.println(instanta01.variabilaDeClasa);
        System.out.println(instanta02.variabilaDeClasa);
    }
}
