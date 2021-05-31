package code._4_student_effort.DrinkingTime;

public class DrinkingTime {
    public static void main(String[] args) {
        IPerson person = new Person.Builder().setName("Duke").build();
        person.walk();
        person.drink();
    }
}
