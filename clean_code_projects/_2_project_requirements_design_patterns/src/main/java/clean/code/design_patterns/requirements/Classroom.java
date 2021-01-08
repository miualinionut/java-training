package clean.code.design_patterns.requirements;

import java.util.ArrayList;
import java.util.List;

public class Classroom implements IClassroom {

    private Integer ID;
    private String classSubject;
    private List<Student> enrolledStudents;
    private List<Teacher> classTeachers;
    private List<Assignment> Assignments;

    public Classroom(Integer ID, String classSubject) {
        this.ID = ID;
        this.classSubject = classSubject;
        enrolledStudents = new ArrayList<>();
        classTeachers = new ArrayList<>();
        Assignments = new ArrayList<>();
    }

    // Make a Nested class so that public components of class Assignment
    // can't be accessed through the Assignments vars by Users other than those
    // specified in the Proxy below

    public class Assignment {
        private String Name;
        private boolean grading;
        private String description;

        public Assignment(String name) {
            Name = name;
            grading = false;
        }

        private void ForGrading(){ grading = true; }

        private void createDescription(String description){
            this.description = description;
        }

        private boolean isForGrading(){ return  grading; }

        private String getDescription(){
            return description;
        }

        private String getName() {
            return Name;
        }
    }


    @Override
    public void registerStudent(Student student) {
        enrolledStudents.add(student);
        student.enrollTo(this);
    }

    @Override
    public void registerTeacher(Teacher teacher) {
        classTeachers.add(teacher);
        teacher.enrollTo(this);
    }

    @Override
    public List<Student> getStudents() {
        return enrolledStudents;
    }

    @Override
    public List<Teacher> getTeachers() {
        return classTeachers;
    }

    @Override
    public String getClassSubject() {
        return classSubject;
    }

    @Override
    public Integer getClassID(){
        return ID;
    }

    private boolean isTeacherRegistered(Teacher teacher){
        for(Teacher tch: classTeachers){
            if(tch == teacher)
                return true;
        }
        return false;
    }

    public Assignment getAssignment(String name){
        for(Assignment assignment: Assignments){
            if(assignment.getName().equals(name)){
                return assignment;
            }
        }
        return null;
    }
    @Override
    public void createAssignment(IUser user, String assignmentName) {
        if(user.getClass() != Teacher.class){
            System.out.println("Command not allowed for this user. User is not a Teacher");
        }
        else if(!isTeacherRegistered((Teacher)user)){
            System.out.println("Command not allowed. Teacher can't reach this Classroom.");
        }
        else{
            Assignments.add(new Assignment(assignmentName));
            notifyStudents(assignmentName);
        }
    }

    void editAssignmentDescription(IUser user, Assignment assignment, String Desc){
        if(user.getClass() != Teacher.class){
            System.out.println("Command not allowed for this user. User is not a Teacher");
        }
        else if(!isTeacherRegistered((Teacher)user)){
            System.out.println("Command not allowed. Teacher can't reach this Classroom.");
        }
        else{
            assignment.createDescription(Desc);
        }
    }

    void assignmentForGrading(IUser user, Assignment assignment){
        if(user.getClass() != Teacher.class) {
            System.out.println("Command not allowed for this user. User is not a Teacher");
        }
        else if(!isTeacherRegistered((Teacher)user)){
            System.out.println("Command not allowed. Teacher can't reach this Classroom.");
        }
        else {
            assignment.ForGrading();
        }
    }

    void notifyStudents(String message){
        for(Student student: enrolledStudents){
            student.update(message);
        }
    }
}
