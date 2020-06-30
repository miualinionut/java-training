package code._4_student_effort;

public class BuilderTest {

    public static void main(String[] args) {

        Person p1 = new Person.PersonBuilder("Alex")
                .university("ACS")
                .job("devops")
                .isMarried(false)
                .build();

        Person p2 = new Person.PersonBuilder("Gicutu")
                .university("Energetica")
                .isMarried(true)
                .build();

        System.out.println(p1);
        System.out.println(p2);

    }

}
