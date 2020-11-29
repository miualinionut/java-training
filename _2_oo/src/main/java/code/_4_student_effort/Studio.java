package code._4_student_effort;

public class Studio {

    public String nume;
    public Film[] filme;

    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }

    public Studio getFilm(String actorName){
        for (Film film:filme){
            if (film.getActor(actorName) != null){
                return this;
            }
        }
        return null;
    }

    public Film getFilmByAge(Integer actorAge){
        for (Film film:filme){
            if (film.getFilm(actorAge) != null){
                System.out.println(film.nume);
            }
        }
        return null;
    }
}
