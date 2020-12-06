package code._4_student_effort.Builder;
//Challenge 6 - Builder
public class Client {
    public static void main(String[] args) {
        Person p1 = new Person.Builder("P1")
                .drivingLicense("B")
                .isMarried(false)
                .job("IT")
                .build();
        Person p2 = new Person.Builder("P2")
                .drivingLicense("A")
                .isMarried(true)
                .university("UTCN")
                .build();
        Person p3 = new Person.Builder("P3")
                .drivingLicense("C")
                .isMarried(false)
                .job("Seller")
                .build();


    }
}
