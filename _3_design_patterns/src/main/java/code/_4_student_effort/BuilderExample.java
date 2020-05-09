package code._4_student_effort;


public class BuilderExample {
    public static void main(String[] args) {
        Person person1 = new Person.Builder("Mircea")

                .university("CTI")
                .job("java developer")
                .isMarried(true)
                .drivingLicense("B")
                .build();
        Person person2 = new Person.Builder("Bianca")

                .university("IS")
                .job("java developer")
                .isMarried(true)
                .drivingLicense("NU")
                .build();



    }
}
