package code._3_in_class;

public class ClasaPtExercitiuVariablie {
        static int variabilaDeClasa = 10;
        int variabilaDeInstanta = 11;

    public static void main(String[] args) {

        ClasaPtExercitiuVariablie instanta01 = new ClasaPtExercitiuVariablie();
        ClasaPtExercitiuVariablie instanta02 = new ClasaPtExercitiuVariablie();

        instanta01.variabilaDeInstanta = 1177;
        instanta02.variabilaDeInstanta = 1189;
        instanta01.variabilaDeClasa = 99;
        System.out.println(instanta01.variabilaDeInstanta);
        System.out.println(instanta02.variabilaDeInstanta);

        System.out.println(instanta02.variabilaDeClasa);

    }
}
