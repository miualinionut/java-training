package code._4_student_effort.Movie_Database;

public class Actor {
    private String nume;
    private Integer varsta;
    private Premiu[] premii;

    public Actor(String nume, Integer varsta, Premiu[] premii){
        this.nume = nume;
        this.varsta = varsta;
        this.premii = premii;
    }

    public String getNume(){
        return this.nume;
    }
    public Integer getVarsta(){
        return this.varsta;
    }

}
