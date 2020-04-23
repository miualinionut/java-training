package code._4_student_effort.Challenge_2;

public class Studio {
    private String nume;
    private Film[] f;

    public Studio(String nume, Film[] f) {
        this.nume = nume;
        this.f = f;
    }

    public String getNume() {
        return nume;
    }

    public Film[] getF() {
        return f;
    }
}
