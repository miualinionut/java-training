package code._4_student_effort.movie;

public class Studio {
    private String nume;
    private Film[] filme;

    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }

    public String getNume() {
        return nume;
    }

    public int getFilmeNr() {
        return filme.length;
    }

    public Film[] getFilme() {
        return filme;
    }
}
