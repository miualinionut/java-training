package code._4_student_effort;

public class Studio {
    String nume;
    Film[] filme;

    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }

    public int getNrOfMovies() {
        return filme.length;
    }

    public String getNume() {
        return nume;
    }

    public Film[] getFilme() {
        return filme;
    }
}