package clean.code.design_patterns.requirements;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

public class Catalog implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private List<Course> Courses= new ArrayList<Course>();
    private static Catalog instance=null;
    public static Catalog getInstance(){
        if(isNull(instance)){
            instance= new Catalog();
        }
        return instance;
    }
    private Catalog(){

    }

    public List<Course> getCourses() {
        return Courses;
    }

    public void setCourses(List<Course> courses) {
        Courses = courses;
    }

    public void addCourse(Course course){
        if(Courses.contains(course)==false) {
            Courses.add(course);
        }
    }
    public void removeCourse(Course course){
        if(Courses.contains(course)==true)
            Courses.remove(course);
    }
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    public void notifyObservers(Grade grade){
        for (Observer observer:observers){
            if (grade.getStudent().getMother()!=null && grade.getStudent().getMother().equals(observer)){
                Notification notification=new Notification(grade);
                observer.update(notification);
            }
            if (grade.getStudent().getFather()!=null && grade.getStudent().getFather().equals(observer)){
                Notification notification=new Notification(grade);
                observer.update(notification);
            }
        }
    }
}
