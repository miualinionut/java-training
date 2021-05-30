package code._4_student_effort.challenge4;


public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student s01 = new Student("Popescu");
        Student s02 = new Student("Ionescu");
        Student s03 = new Student("Dragomirescu");

        s01.learnFrom(teacher);
        s02.learnFrom(teacher);
        s03.learnFrom(teacher);

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
