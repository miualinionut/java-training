package code._4_student_effort.Movie_Database;

public class Studio {
    private String nume;
    private Film[] filme;

    public Studio(String nume, Film[] filme){
        this.nume = nume;
        this.filme = filme;
    }

    public String getNume(){
        return this.nume;
    }

    public int getNumberOfMovies(){
        return this.filme.length;
    }
    public Film[] getFilme(){
        return this.filme;
    }

}
