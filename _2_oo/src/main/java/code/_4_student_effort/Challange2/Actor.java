package code._4_student_effort.Challange2;

public class Actor {
    private String nume;
    private Integer varsta;
    Premiu[] premii;
    public Actor(String _nume, Integer _varsta, Premiu[] _premii)
    {
        nume = _nume;
        varsta = _varsta;
        premii = _premii;
    }
    public String getNume()
    {
        return nume;
    }
    public Integer getVarsta()
    {
        return varsta;
    }
    public Premiu[] getPremii()
    {
        return premii;
    }
}