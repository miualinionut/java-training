package code._4_student_effort.MovieDatabase;

public class Premiu {
    String nume;
    Integer an;

    public Premiu(String nume, Integer an) {
        this.nume = nume;
        this.an = an;
    }

    @Override
    public String toString() {
        return "Premiu{" +
                "nume='" + nume + '\'' +
                ", an=" + an +
                '}';
    }
}
