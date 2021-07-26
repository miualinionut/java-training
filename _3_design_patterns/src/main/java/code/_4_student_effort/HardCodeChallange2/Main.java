package code._4_student_effort.HardCodeChallange2;

public class Main {
    public static void main(String[] args) {
        IPerson person = new Person.Builder().setName("Duke").build();
        person.walk();
        person.drink();
    }
}
