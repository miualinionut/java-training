package code._4_student_effort.challenge2;

public class Premiu {

    String nume;
    Integer an;

    Premiu() {
    }

    ;

    Premiu(String nume, Integer an) {

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
