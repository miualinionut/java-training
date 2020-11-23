package code._4_student_effort.movies_database;

public class Film {
    Integer anAparitie;
    public String nume;
    public Actor[] actori;
    public Film (Integer anAparitie, String nume, Actor[] actori){
        this.anAparitie=anAparitie;
        this.nume=nume;
        this.actori=actori;
    }
}
