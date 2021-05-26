package code._4_student_effort._6_builder;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person.Builder("Andreea")
                .setJob("Software Developer Intern")
                .setIsMarried(false)
                .build();

        Person p2 = new Person.Builder("Marius")
                .setDrivingLicense("C")
                .setIsMarried(true)
                .build();

        System.out.println(p1);
        System.out.println(p2);
    }
}
