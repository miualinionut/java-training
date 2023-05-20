package code._3_in_class.factory;

public class StudentBabyBoomer implements IStudent{
    String universitate;
    int anulNasterii;
    public String getNumeUniversitate() {
        return this.universitate;
    }

    public String hello() {
        return "ALO! Salut, tataie!";
    }
}
