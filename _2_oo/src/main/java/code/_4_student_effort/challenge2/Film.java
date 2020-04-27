package code._4_student_effort.challenge2;

import java.util.Arrays;

public class Film {

    Integer anAparatie;
    String nume;
    Actor[] actori;

    Film() {
    }

    ;

    Film(Integer anAparatie, String nume, Actor[] actori) {

        this.anAparatie = anAparatie;
        this.nume = nume;
        this.actori = actori;

    }

    @Override
    public String toString() {
        return "Film{" +
                "anAparatie=" + anAparatie +
                ", nume='" + nume + '\'' +
                ", actori=" + Arrays.toString(actori) +
                '}';
    }
}
