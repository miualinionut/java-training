package clean.code.design_patterns.requirements;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        TeacherFactory monthlySalaryTeacherFactory = new MonthlySalaryTeacherFactory(500);
        TeacherFactory hourlySalaryTeacherFactory = new HourlySalaryTeacherFactory(20, 40);

        Teacher Andra = monthlySalaryTeacherFactory.createTeacher(1, "Andra");
        Teacher Maria = monthlySalaryTeacherFactory.createTeacher(2, "Maria");
        Teacher Valentina = hourlySalaryTeacherFactory.createTeacher(3, "Valentina");

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Andra);
        teacherList.add(Maria);
        teacherList.add(Valentina);

        Student Raluca = new Student(1, "Raluca", 4);
        Student Cristina = new Student(2, "Cristina", 10);
        Student Iasmina = new Student(3, "Iasmina", 5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(Raluca);
        studentList.add(Cristina);
        studentList.add(Iasmina);

        School school = School.getInstance();
        school.addTeacher(Andra);
        school.addTeacher(Maria);
        school.addTeacher(Valentina);

        school.addStudent(Raluca);
        school.addStudent(Cristina);
        school.addStudent(Iasmina);

        Raluca.payFees(5000);
        Cristina.payFees(6000);
        System.out.println("School has earned $" + school.getTotalMoneyEarned());

        System.out.println("----Making SCHOOL PAY SALARY----");
        Valentina.receiveSalary();
        Maria.receiveSalary();
        System.out.println("School has spent $" + school.getTotalMoneySpent());

        System.out.println(Valentina);
        System.out.println(Maria);
    }
}
