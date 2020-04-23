package code._4_student_effort.Challenge_2;

public class Film {
    private Integer anAparitie;
    private String nume;
    private Actor[] a;

    public Film(Integer anAparitie, String nume, Actor[] a) {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.a = a;
    }

    public Actor[] getA() {
        return a;
    }

    public String getNume() {
        return nume;
    }
}
