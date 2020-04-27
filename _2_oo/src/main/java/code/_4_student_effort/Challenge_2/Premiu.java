package code._4_student_effort.Challenge_2;

public class Premiu {
    public Premiu(String nume, Integer an) {
        this.nume = nume;
        this.an = an;
    }

    private String nume;
    private int an;

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
