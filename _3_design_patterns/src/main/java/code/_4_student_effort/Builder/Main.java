package code._4_student_effort.Builder;

public class Main {
    public static void main(String[] args){
        Person person1 = new Person.Builder("Gigel")
                .setJob("Game Tester")
                .setIsMaried(false)
                .build();
        Person person2 = new Person.Builder("Grigorescu")
                .setJob("Uber Driver")
                .setIsMaried(false)
                .setDrivingLicense("B")
                .build();
        Person person3 = new Person.Builder("Florescu")
                .setJob("Engineer")
                .setUniversity("Politehnica University of Bucharest")
                .setIsMaried(true)
                .build();

    }
}
