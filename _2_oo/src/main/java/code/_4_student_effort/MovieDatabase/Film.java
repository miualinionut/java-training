package code._4_student_effort.MovieDatabase;

public class Film {
    public int anAparitie;
    public String nume;
    public Actor[] actori;

    public Film(int anAparitie, String nume, Actor[] actori) {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori;
    }
}
