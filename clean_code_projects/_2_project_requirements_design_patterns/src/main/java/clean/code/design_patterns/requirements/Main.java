package clean.code.design_patterns.requirements;

public class Main {
    //Assignment builder ??
    static Integer classIdGenerator = 1;

    public static Integer generateID() {
        return classIdGenerator++;
    }

    public static void main(String[] args) {
        Student student1 = new Student.Builder("UnuS")
                .setFirstName("Gigel")
                .setLastName("Frone")
                .setAge(18).build();

        Student student2 = new Student.Builder("DOiS")
                .setFirstName("Marian").build();

        Teacher Koro = new Teacher.Builder("Caracratiza")
                .addTeachSubject("All")
                .setAge(40).build();

        Teacher Dascal = new Teacher.Builder("Prof").build();

        Classroom romanaClassroom = new Classroom(generateID(), "Romana1");
        Classroom englezClassroom = new Classroom(generateID(), "Engleza2");


        romanaClassroom.registerTeacher(Koro);
        englezClassroom.registerTeacher(Koro);
        romanaClassroom.registerStudent(student1);
        romanaClassroom.registerStudent(student2);

        romanaClassroom.createAssignment(Koro, "Tema pe maine");
        romanaClassroom.editAssignmentDescription(Koro, romanaClassroom.getAssignment("Tema pe maine"), "Tema este pe maine");
        romanaClassroom.createAssignment(Dascal, "Test");
        romanaClassroom.createAssignment(student1, "Hehe");


        Koro.displayUserData();
        student1.displayUserData();
        student2.displayUserData();
    }
}
