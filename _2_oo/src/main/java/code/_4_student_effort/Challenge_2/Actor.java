package code._4_student_effort.Challenge_2;

public class Actor {
    private String nume;
    private Integer varsta;
    private Premiu[] p;

    public Actor(String nume, Integer varsta, Premiu[] p) {
        this.nume = nume;
        this.varsta = varsta;
        this.p = p;
    }

    public String getNume() {
        return nume;
    }

    public Integer getVarsta() {
        return varsta;
    }
}
