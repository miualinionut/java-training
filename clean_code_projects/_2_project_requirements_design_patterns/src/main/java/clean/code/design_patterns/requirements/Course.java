package clean.code.design_patterns.requirements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Course {
    private  String name;
    private Teacher teacher;
    private ArrayList<Grade> grades=new ArrayList<Grade>();

    public Course(String name,Teacher teacher, ArrayList<Grade> grades) {
        this.name=name;
        this.teacher=teacher;
        this.grades=grades;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return this.getName();
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public ArrayList<Grade> getGrades() {
        return grades;

    }
    public Grade getGrade(Student student){
        for(Grade grade:grades){
            if(grade.getStudent().equals(student))
                return grade;
        }
        return null;
    }
    public void addGrade(Grade grade){
        grades.add(grade);
    }
    public ArrayList<Student> getAllStudents(){
        ArrayList<Student> list= new ArrayList<Student>();
        for(Grade grade: grades){
                list.add(grade.getStudent());
        }
        return list;
    }
    public HashMap<Student,Grade>getAllStudentGrades(){
        HashMap<Student,Grade> map=new HashMap<Student,Grade>();
        ArrayList<Student> students=getAllStudents();
        for(Student student:students){
            for(Grade grade:grades){
                if(grade.getStudent().equals(student)){
                    {
                        map.put(student,grade);
                        break;
                    }

                }
            }

        }
        return map;
    }

}
