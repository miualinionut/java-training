package code._3_in_class.factory;

public class StudentFactory {

    public static IStudent valueof(int anulNasterii, String Universitatea ) {
        IStudent student = null;
        if (1995 < anulNasterii && anulNasterii < 2015) {
            student = new StudentGenZ(Universitatea);
        } else if (1980 < anulNasterii && anulNasterii < 1994) {
            student = new StudentGenX(Universitatea);
        } else if (1964 < anulNasterii && anulNasterii < 1980) {
            student = new StudentMilenial(Universitatea);
        }
        return student;
    }
    }

