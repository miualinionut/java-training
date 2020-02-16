package code._4_student_effort.MovieDatabase;

public class Premiu {
    String nume;
    Integer an;

    public Premiu(String nume, Integer an) {
        this.nume = nume;
        this.an = an;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Integer getAn() {
        return an;
    }

    public void setAn(Integer an) {
        this.an = an;
    }
}
