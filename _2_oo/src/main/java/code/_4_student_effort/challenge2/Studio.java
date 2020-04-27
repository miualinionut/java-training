package code._4_student_effort.challenge2;

import java.util.Arrays;

public class Studio {

    String nume;
    Film[] filme;

    Studio() {
    }

    ;

    Studio(String nume, Film[] filme) {

        this.nume = nume;
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Studio{" +
                "nume='" + nume + '\'' +
                ", filme=" + Arrays.toString(filme) +
                '}';
    }
}
