package code._4_student_effort.Movie_Database;

public class Actor {
    public String nume;
    public int varsta;
    public Premiu[] premii;

    Actor(String nume, int varsta, Premiu[] premii)
    {
        this.nume = nume;
        this.varsta = varsta;
        this.premii = premii;
    }
}
