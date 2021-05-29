public class Studio {
    private
           String nume;
           Film [] filme;

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

    public void setFilme(Film[] filme) {
        this.filme = filme;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
