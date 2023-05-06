package code._3_in_class.exceptions;

public class StudentFactory {

        public static IStudent valueof(int anulNasterii, String Universitatea ) {
            IStudent student;
            if (1995 < anulNasterii && anulNasterii < 2015) {
                student = new StudentGenZ(Universitatea);
            } else if (1980 < anulNasterii && anulNasterii < 1994) {
                student = new StudentGenX(Universitatea);
            } else if (1964 < anulNasterii && anulNasterii < 1980) {
                student = new StudentMilenial(Universitatea);
            }else if(1944 < anulNasterii && anulNasterii < 1964){
                student = new StudentBabyBoomer(Universitatea);
            }else{
                throw new RuntimeException("anulNasterii nu este valid, alegeti un an in intervalul [1944-2015]");
            }
            return student;
        }
    }

