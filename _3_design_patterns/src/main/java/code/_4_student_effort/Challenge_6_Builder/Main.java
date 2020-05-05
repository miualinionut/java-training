package code._4_student_effort.Challenge_6_Builder;

public class Main {
    public static void main(String[] args) {

        Person person = new Person.Builder("Alex","Ionescu")
                .drivingLicense("B")
                .isMarried(false)
                .build();


    }
}
