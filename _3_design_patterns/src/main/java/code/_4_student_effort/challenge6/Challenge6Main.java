package code._4_student_effort.challenge6;

import org.w3c.dom.ls.LSOutput;

public class Challenge6Main {
    public static void main(String[] args) {

        Person person01 = new Person.Builder("Popescu")
                .job("java developer")
                .university("FMI")
                .isMarried(false)
                .build();

        Person person02 = new Person.Builder("Ionescu")
                .drivingLicense("B")
                .isMarried(true)
                .build();


        System.out.println(person01);
        System.out.println(person02);
    }



}
