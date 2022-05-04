package code._3_in_class;

public class ClasaPtExercitiuCuVariabile {
    //cerinta:
    //1. defineste variabila de clasa -> cu static
    //2. defineste variabila de instanta -> fara static
    //3. defineste variabila locala -> in metoda

    static int variabiladeclasa = 10;
    int variabiladeinstanta = 11;

    public static void main(String[] args) {
        int variabilalocala = 12;
        ClasaPtExercitiuCuVariabile instanta1 = new ClasaPtExercitiuCuVariabile();
        ClasaPtExercitiuCuVariabile instanta2 = new ClasaPtExercitiuCuVariabile();

        instanta1.variabiladeinstanta = 1177;
        instanta1.variabiladeclasa = 1;

        System.out.println(instanta1.variabiladeinstanta);
        System.out.println(instanta2.variabiladeinstanta);
        System.out.println("*****************************");
        System.out.println(instanta1.variabiladeclasa);
        System.out.println(instanta2.variabiladeclasa);
    }

}
