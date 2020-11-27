package code._4_student_effort.Challange2;

public class Studio {
    private String nume;
    private Film[] filme;
    public Studio(String _nume, Film[] _filme)
    {
        nume = _nume;
        filme = _filme;
    }
    public String getNume()
    {
        return nume;
    }
    public Film[] getFilme()
    {
        return filme;
    }
}
