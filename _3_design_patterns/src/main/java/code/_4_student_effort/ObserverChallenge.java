package code._4_student_effort;

public class ObserverChallenge {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student4 s01 = new Student4("Popescu");
        Student4 s02 = new Student4("Ionescu");
        Student4 s03 = new Student4("Dragomirescu");

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

