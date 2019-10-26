package code._2_challenge._4_observer;

public class TeachingClassExample {
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
    for (int i = 0; i < javaTopics.length; i++) {
      teacher.teach(javaTopics[i]);
    }
  }
}
