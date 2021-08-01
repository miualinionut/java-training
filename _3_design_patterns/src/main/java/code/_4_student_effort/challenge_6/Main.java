package code._4_student_effort.challenge_6;

public class Main {
    public static void main(String[] args) {


        Person person1 = new Builder("Andrei")
                .job("Java Software Developer")
                .university("UPB")
                .drivingLicence("B")
                .create();

        Person person2 = new Builder("Andrei")
                .job("Medic")
                .university("UMF")
                .drivingLicence("C")
                .create();

        System.out.println(person1);
        System.out.println(person2);
    }
}
