package code._4_student_effort.challenge_4_observer;

public class Main {
    public static void main(String[] args) {
        System.out.println("CODE CHALLENGE 4");

        Teacher teacher = new Teacher();
        Student s01 = new Student("Popescu");
        Student s02 = new Student("Babescu");
        Student s03 = new Student("Citescu");

        s01.listenTo(teacher);
        s02.listenTo(teacher);
        s03.listenTo(teacher);

        String[] javaTopics = new String[]{
                "basics",
                "oo",
                "design patterns"
        };

        for(String topic : javaTopics) {
            teacher.teach(topic);
        }
    }
}
