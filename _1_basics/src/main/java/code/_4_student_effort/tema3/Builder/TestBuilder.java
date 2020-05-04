package code._4_student_effort.tema3.Builder;

public class TestBuilder {

    public static void main(String[] args) {

        Person p1 = new Person.Builder("Ioana").build();
        Person p2 = new Person.Builder("Mihai").setJob("developer").setDriving(false).setUniversity("Unibuc").build();
        Person p3 = new Person.Builder("Ionut").setJob("avocat").setMarried(true).build();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
