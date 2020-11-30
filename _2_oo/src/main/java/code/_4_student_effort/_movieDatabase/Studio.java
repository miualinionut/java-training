package code._4_student_effort._movieDatabase;

public class Studio {
    private String Nume;
    private Film [] Filme;

    public Studio(String nume, Film [] filme) {
        Nume = nume;
        Filme = filme;
    }

    public String getNume() {
        return Nume;
    }

    public int GetNumberOfFilms() {
        return Filme.length;
    }

    public Film[] getFilme() {
        return Filme;
    }
}
