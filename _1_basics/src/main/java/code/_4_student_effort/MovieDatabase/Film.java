package code._4_student_effort.MovieDatabase;

public class Film {
    public final Integer anAparitie;
    public final String nume;
    public Actor[] actori;

    public Film(Integer anAparitie, String nume, Actor[] actori) {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori;
    }
}
