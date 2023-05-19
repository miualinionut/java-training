package code._3_in_class.exceptions;

public class StudentBabyBoomer implements IStudent {

    private String Universitatea;

    public StudentBabyBoomer(String Universitate) {
        this.Universitatea = Universitate;
    }

    @Override
    public String getNumeUniversitateaUndeStudiaza() {
        return this.Universitatea;
    }

    @Override
    public String hello() {
        return "salut";
    }
}
