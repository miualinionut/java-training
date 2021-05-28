package code._4_student_effort.code.challenge2;

import code._4_student_effort.code.challenge2.Actor;

public class Film {
    private Integer anAparitie;
    private String nume;
    private Actor[] actori;
    public Film(Integer anAparitie, String nume, Actor[] actori) {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori;
    }

    public String getNume() {
        return nume;
    }

    public Actor[] getActori() {
        return actori;
    }

    public Integer getAnAparitie() {
        return anAparitie;
    }
}
