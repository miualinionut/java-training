package code._4_student_effort;

public class Studio {
    private String nume;
    private Film[] film;
    public Studio(String n, Film[] f){
        nume=n;
        film=f;
    }
    public int nrfilme(){
        return film.length;
    }

    public String getNume() {
        return nume;
    }
    public String getActor(String s){
        for (int i = 0; i < film.length; i++) {
            if(film[i].getActor(s)==true)return nume;
        }
    return null;
    }
    public String getFilm(){
        for (int i = 0; i < film.length; i++) {
            if(film[i].varsta()==true)return film[i].getNume();
        }
        return null;
    }
}
