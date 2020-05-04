package code._4_student_effort._4_oberver_code_challenge;


public class Main {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student s01 = new Student("Popescu");
        Student s02 = new Student("Ionescu");
        Student s03 = new Student("Dragomirescu");

        s01.listenTo(teacher);
        s02.listenTo(teacher);
        s03.listenTo(teacher);

        String[] javaTopics = new String[]{
                "basics",
                "oo",
                "design patterns"
        };

        for (String javaTopic : javaTopics) {
            teacher.teach(javaTopic);
        }
    }
}
