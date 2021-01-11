package code._4_student_effort.builder;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder("Gabriel")
                                .setDrivingLicense(true)
                                .setJob("doctor")
                                .build();
        Person person1 = new Person.Builder("Iustina")
                                .setMarried(true)
                                .setUniversity("Politehnica")
                                .build();

        System.out.println(person);
        System.out.println(person1);
    }
}
