package code._4_student_effort.Builder;

public class Main {
    public static void main(String[] args) {
        Person person01 = new Person.Builder("DANI")
                .job("dev ops")
                .university("CTI")
                .isMarried(false)
                .build();

        Person person02 = new Person.Builder("ALEX")
                .drivingLicense("B")
                .isMarried(true)
                .build();

    }
}
