package code._4_student_effort._6_builder_code_challenge;

public class Main {

    public static void main(String[] args) {

        Person person01 =
                new Person.Builder("Popescu")
                .job("java developer")
                .university("FMI")
                .isMarried(false)
                .build();

        Person person02 =
                new Person.Builder("Ionescu")
                .drivingLicense("B")
                .isMarried(true)
                .build();
    }
}
