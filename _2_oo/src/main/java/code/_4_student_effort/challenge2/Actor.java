package code._4_student_effort.challenge2;

import java.util.Arrays;

public class Actor {

    String nume;
    Integer varsta;
    Premiu[] premii;

    Actor() {
    }

    ;

    Actor(String nume, Integer varsta, Premiu[] premii) {

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
