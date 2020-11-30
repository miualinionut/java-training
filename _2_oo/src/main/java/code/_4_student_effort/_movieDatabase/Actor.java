package code._4_student_effort._movieDatabase;

public class Actor {
    private String Nume;
    private int Varsta;
    private Premiu [] Premii;

    public Actor(String nume, int varsta, Premiu [] premii) {
        Nume = nume;
        Varsta = varsta;
        Premii = premii;
    }

    public String getNume() {
        return Nume;
    }

    public int getVarsta() {
        return Varsta;
    }
}
