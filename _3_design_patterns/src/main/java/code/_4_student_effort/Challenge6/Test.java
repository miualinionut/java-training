package code._4_student_effort.Challenge6;
import code._4_student_effort.Challenge6.Person;

public class Test {
    public static void main(String[] args) {

       Person person01 = new Person.Builder("Alex")
                .job("web designer")
                .isMarried(false)
                .build();

       Person person02 = new Person.Builder("Andrei")
                .drivingLicense("B2")
                .university("Universitatea Politehnica")
                .build();
       System.out.println(person01.university);
       System.out.println(person02.university);
       System.out.println(person01);

    }
}
