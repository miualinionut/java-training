package code._4_student_effort.movie_database;

public class Actor {
    public final String nume;
    public final Integer varsta;
    public final Premiu[] premii;

    public Actor(String nume, Integer varsta, Premiu[] premii) {
        this.nume = nume;
        this.varsta = varsta;
        this.premii = premii;
    }
}
