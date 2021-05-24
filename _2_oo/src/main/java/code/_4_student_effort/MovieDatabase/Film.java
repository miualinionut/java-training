package code._4_student_effort.MovieDatabase;

public class Film
{
    Integer anAparitie;
    String nume;
    Actor[] actori;

    public Film(Integer anAparitie, String nume, Actor[] actori)
    {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori;
    }

    public boolean getNumeActorFilm(String numeCautat)
    {
        for (Actor a: actori)
            if (a.getNume().equals(numeCautat))
                return true;
        return false;
    }

    public String filmeSeniori()
    {
        for (Actor a: actori)
            if (a.getVarsta() > 50)
                return nume;
        return "";
    }
}
