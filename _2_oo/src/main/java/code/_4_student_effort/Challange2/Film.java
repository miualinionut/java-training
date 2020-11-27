package code._4_student_effort.Challange2;

public class Film {
    private String nume;
    private Integer anAparitie;
    private Actor actori[];
    public Film(Integer _anAparitie, String _nume, Actor _actori[])
    {
        nume = _nume;
        anAparitie = _anAparitie;
        actori = _actori;
    }
    public String getNume()
    {
        return nume;
    }
    public Integer getAnAparitie()
    {
        return anAparitie;
    }
    public Actor[] getActori()
    {
        return actori;
    }

}
