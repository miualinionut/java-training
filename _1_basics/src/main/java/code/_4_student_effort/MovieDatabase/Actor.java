package code._4_student_effort.MovieDatabase;

public class Actor {
    public final String nume;
    public Integer varsta;
    public Premiu[] premii;

    public Actor(String nume, Integer varsta, Premiu[] premii) {
        this.nume = nume;
        this.varsta = varsta;
        this.premii = premii;
    }
}
