package code._4_student_effort;

public class Film {
    public String nume;
    public Integer anAparitie;
    public Actor[] actori;

    Film(Integer anAparitie, String nume,  Actor[] actori) {
        this.nume = nume;
        this.anAparitie = anAparitie;
        this.actori = actori;
    }
}
