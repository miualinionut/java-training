package code._4_student_effort;

import java.util.Arrays;

public class Actor {
    private String nume;
    private int varsta;
    private Premiu[] premiu;

    public Actor(String nume, int varsta, Premiu[] premiu) {
        this.nume = nume;
        this.varsta = varsta;
        this.premiu = premiu;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public Premiu[] getPremiu() {
        return premiu;
    }

    public void setPremiu(Premiu[] premiu) {
        this.premiu = premiu;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", premiu=" + Arrays.toString(premiu) +
                '}';
    }
}
