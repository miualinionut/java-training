package code._3_in_class.factory;

public class StudentGenX implements IStudent{

    private String Universitatea;

    public StudentGenX(String Universitate) {
        this.Universitatea = Universitate;
    }

    @Override
    public String getNumeUniversitateaUndeStudiaza() {
        return this.Universitatea;
    }

    @Override
    public String hello() {
        return null;
    }
}
