package code._4_student_effort.MovieDatabase;

import java.util.Arrays;

public class Actor {
    String nume;
    Integer varsta;
    Premiu[] premii;


    public Actor(String nume, Integer varsta, Premiu[] premii) {
        this.nume = nume;
        this.varsta = varsta;
        this.premii = premii;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", premii=" + Arrays.toString(premii) +
                '}';
    }
}
