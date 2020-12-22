package code._4_student_effort.Builder;

public class BuilderPerson {
    public static void main(String[] args) {
        Person person = new Person.Builder("John").setJob("developer").isMarried(true).setDrivingLicense("A").build();
    }
}
