package code._4_student_effort.movie_database;

public class Studio {
    private final String nume;
    private final Film[] filme;

    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }

    public String getNume() {
        return nume;
    }

    public Film[] getFilme() {
        return filme;
    }
}
