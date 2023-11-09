package code._3_in_class;

public class Boomer implements IStudent{
    int varsta;
    String scoala;

    public Boomer(String name, int age) {
        this.scoala = name;
        this.varsta = age;
    }
    @Override
    public void getScoala() {
        System.out.println(scoala);
    }

    @Override
    public void afisareGeneratie() {
        System.out.println("Am varsta de " + varsta + " ani, sunt din generati Boomer si sunt la scoala " + scoala);
    }
}
