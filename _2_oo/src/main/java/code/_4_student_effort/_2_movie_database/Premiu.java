package code._4_student_effort._2_movie_database;

public class Premiu {
    String nume;
    Integer an;

    public Premiu(String nume, int an) {
        this.nume = nume;
        this.an = an;
    }

    public Premiu() {
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }
}
