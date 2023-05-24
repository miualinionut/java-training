import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

// Clasa de bază pentru persoane
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Clasa elevului care moștenește clasa Person
class Student extends Person {
    private List<String> grades;

    public Student(String name) {
        super(name);
        grades = new ArrayList<>();
    }

    public void addGrade(String grade) {
        grades.add(grade);
        System.out.println("Notă nouă adăugată elevului " + getName() + ": " + grade);
    }
}

// Clasa profesorului care moștenește clasa Person
class Teacher extends Person {
    private SchoolCatalog catalog;
    private Random random;

    public Teacher(String name) {
        super(name);
        catalog = SchoolCatalog.getInstance();
        random = new Random();
    }

    public void addGrade(String studentName) {
        // Generăm o notă aleatorie între 1 și 10
        String grade = String.valueOf(random.nextInt(10) + 1);
        catalog.addGrade(studentName, grade);
    }
}

// Clasa catalogului școlar care utilizează Singleton și Observer
class SchoolCatalog {
    private static SchoolCatalog instance;
    private List<Student> students;
    private Map<Student, List<NotificationObserver>> observers;

    // Constructor privat pentru a preveni crearea directă a instanței
    private SchoolCatalog() {
        students = new ArrayList<>();
        observers = new HashMap<>();
    }

    // Metoda statică pentru a obține instanța catalogului școlar
    public static synchronized SchoolCatalog getInstance() {
        if (instance == null) {
            instance = new SchoolCatalog();
        }
        return instance;
    }

    // Metoda pentru adăugarea unui elev în catalog
    public void addStudent(Student student) {
        students.add(student);
        observers.put(student, new ArrayList<>());
    }

    // Metoda pentru adăugarea unui observator pentru un elev
    public void addObserver(Student student, NotificationObserver observer) {
        List<NotificationObserver> studentObservers = observers.get(student);
        studentObservers.add(observer);
    }

    // Metoda pentru eliminarea unui observator pentru un elev
    public void removeObserver(Student student, NotificationObserver observer) {
        List<NotificationObserver> studentObservers = observers.get(student);
        studentObservers.remove(observer);
    }

    // Metoda pentru adăugarea unei note pentru un elev
    public void addGrade(String studentName, String grade) {
        for (Student student : students) {
            if (student.getName().equals(studentName)) {
                student.addGrade(grade);
                notifyObservers(student, studentName, grade);
                break;
            }
        }
    }

    // Metoda privată pentru notificarea observatorilor
    private void notifyObservers(Student student, String studentName, String grade) {
        List<NotificationObserver> studentObservers = observers.get(student);
        for (NotificationObserver observer : studentObservers) {
            observer.update(studentName, grade);
        }
    }
}

// Interfața Observer pentru observatorii de notificări
interface NotificationObserver {
    void update(String studentName, String grade);
}

// Clasa Părinte care implementează interfața NotificationObserver
class Parent implements NotificationObserver {
    private String name;
    private Student child;

    public Parent(String name, Student child) {
        this.name = name;
        this.child = child;
    }

    public void update(String studentName, String grade) {
        if (studentName.equals(child.getName())) {
            System.out.println("Părintele " + name + " a primit notificare pentru elevul " + studentName + ": Notă nouă: " + grade);
        }
    }
}

// Clasa principală care demonstrează utilizarea catalogului școlar
class SchoolCatalogApp {
    public static void main(String[] args) {
        // Cream catalogul școlar folosind Singleton
        SchoolCatalog catalog = SchoolCatalog.getInstance();

        // Adăugăm elevi în catalog
        Student student1 = new Student("Ionut");
        Student student2 = new Student("Alice");
        Student student3 = new Student("Maria");
        catalog.addStudent(student1);
        catalog.addStudent(student2);
        catalog.addStudent(student3);

        // Cream profesor
        Teacher teacher = new Teacher("Popescu");

        // Cream părinți și adăugăm observatori pentru fiecare elev
        Parent parent1 = new Parent("Mateescu", student1);
        Parent parent2 = new Parent("Anghelescu", student2);
        Parent parent3 = new Parent("Ionescu", student3);
        catalog.addObserver(student1, parent1);
        catalog.addObserver(student2, parent2);
        catalog.addObserver(student3, parent3);

        // Profesorul adaugă note pentru elevi
        teacher.addGrade("Ionut");
        teacher.addGrade("Alice");
        teacher.addGrade("Maria");

        // Eliminăm un observator (părinte) de la catalog
        catalog.removeObserver(student2, parent2);

        // Profesorul adaugă alte note pentru elevi
        teacher.addGrade("Ionut");
        teacher.addGrade("Maria");
    }
}
