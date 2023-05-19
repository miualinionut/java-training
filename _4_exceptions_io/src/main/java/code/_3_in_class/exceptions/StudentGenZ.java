package code._3_in_class.exceptions;

public class StudentGenZ implements IStudent {

    private String Universitatea;

    public StudentGenZ(String Universitatea) {
        this.Universitatea = Universitatea;
    }

    @Override
    public String getNumeUniversitateaUndeStudiaza() {
        return Universitatea;
    }

    @Override
    public String hello() {
        return "Hmm";
    }
}
