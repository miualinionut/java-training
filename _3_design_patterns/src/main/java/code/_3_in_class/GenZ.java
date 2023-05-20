package code._3_in_class;

public class GenZ implements IStudent{

    int varsta;
    String scoala;

    public GenZ(String name, int age) {
        this.scoala = name;
        this.varsta = age;
    }
    @Override
    public void getScoala() {
        System.out.println(scoala);
    }

    @Override
    public void afisareGeneratie() {
        System.out.println("Am varsta de " + varsta + " ani si sunt din generati GenZ!");
    }
}
