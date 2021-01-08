package clean.code.design_patterns.requirements;

import java.util.List;

public interface IClassroom {
    void registerStudent(Student student);
    void registerTeacher(Teacher teacher);
    List<Student> getStudents();
    List<Teacher> getTeachers();
    String getClassSubject();
    Integer getClassID();

    void createAssignment(IUser user, String assignmentName);
}
