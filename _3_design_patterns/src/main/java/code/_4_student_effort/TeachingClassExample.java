package code._4_student_effort;

public class TeachingClassExample {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student2 s01 = new Student2("Popescu");
        Student2 s02 = new Student2("Ionescu");
        Student2 s03 = new Student2("Dragomirescu");

        s01.listenTo(teacher);
        s02.listenTo(teacher);
        s03.listenTo(teacher);

        String[] javaTopics = new String[]{
                "basics",
                "oo",
                "design patterns"
        };
        for (int i = 0; i < javaTopics.length; i++) {
            teacher.teach(javaTopics[i]);
        }
    }
}