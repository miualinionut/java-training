package code._4_student_effort._2_movie_database;

public class Studio {
    String nume;

    public String getNume() {
        return nume;
    }

    Film[] filme;

    public Film[] getFilme() {
        return filme;
    }

    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }

    public boolean hasEnoughMovies(int minimumMovies) {
        return filme.length > minimumMovies;
    }

    public boolean hasActorName(String actorName) {
        for (Film film : filme)
            for (Actor actor : film.actori)
                if (actor.nume.equals(actorName))
                    return true;

        return false;
    }
}
