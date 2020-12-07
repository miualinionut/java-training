package code._4_student_effort.Builder;

public class Test {
    public static void main(String[] args) {
        Person person = new Person.Builder("Maria")
                .setDrivingLicence("B")
                .setMarried(false)
                .build();
    }
}
