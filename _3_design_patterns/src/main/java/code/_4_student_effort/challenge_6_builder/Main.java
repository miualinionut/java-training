package code._4_student_effort.challenge_6_builder;

public class Main {
    public static void main(String[] args) {
        System.out.println("CODE CHALLENGE 6");
        Person person01 = new Person.Builder("Okarin").build();
        Person person02 = new Person.Builder("Mayushi")
                                    .setDrivingLicence(true)
                                    .setMarried(false)
                                    .setJob("Nevasta mea")
                                    .build();
        System.out.println(person01);
        System.out.println(person02);

    }
}
