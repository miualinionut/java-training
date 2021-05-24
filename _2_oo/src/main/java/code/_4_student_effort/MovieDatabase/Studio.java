package code._4_student_effort.MovieDatabase;

public class Studio
{
    String nume;
    Film[] filme;

    public Studio(String nume, Film[] filme)
    {
        this.nume = nume;
        this.filme = filme;
    }

    public String twoMovies()
    {
        int nr = 0;
        for (Film f:filme)
            nr++;
        if (nr > 2)
            return nume;
        return "Niciun studio cu peste doua filme!";
    }

    public String cautaActor(String numeCautat)
    {
        for (Film f:filme)
            if (f.getNumeActorFilm(numeCautat))
                return nume;
        return "";
    }
}
