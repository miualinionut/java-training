package clean.code.design_patterns.requirements;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //TODO implement your design patterns in this package
        Catalog Catalogul_Meu=Catalog.getInstance();
        Student s1= (Student)UserFactory.getUser("Student","Gigel","Frone");
        s1.setMother((Parent)UserFactory.getUser("Parent","Floricica","Frone"));
        s1.setFather((Parent)UserFactory.getUser("Parent","Dodel","Frone"));
        Student s2= (Student)UserFactory.getUser("Student","Sonia","Tache");
        s2.setMother((Parent)UserFactory.getUser("Parent","Mihaela","Tache"));
        Student s3= (Student)UserFactory.getUser("Student","Miruna","Mihalache");
        s3.setFather((Parent)UserFactory.getUser("Parent","Dorel","Mihalache"));
        Student s4= (Student)UserFactory.getUser("Student","Ionel","Ionescu");
        s4.setMother((Parent)UserFactory.getUser("Parent","Alina","Ionescu"));
        s4.setFather((Parent)UserFactory.getUser("Parent","Cristian","Ionescu"));

        Teacher t1=(Teacher)UserFactory.getUser("Teacher","Ion","Tase");
        Teacher t2=(Teacher)UserFactory.getUser("Teacher","Marian","Ticu");

        Course c1= new Course ("Sisteme de Operare",t1,new ArrayList<>());
        c1.addGrade(new Grade(7.0,s1,c1.getName()));
        c1.addGrade(new Grade(3.0,s2,c1.getName()));
        c1.addGrade(new Grade(8.0,s3,c1.getName()));
        c1.addGrade(new Grade(10.0,s4,c1.getName()));
        Catalogul_Meu.addCourse(c1);

        Course c2= new Course ("Analiza Algoritmilor",t2,new ArrayList<>());
        c2.addGrade(new Grade(5.0,s1,c2.getName()));
        c2.addGrade(new Grade(9.3,s2,c2.getName()));
        c2.addGrade(new Grade(8.4,s3,c2.getName()));
        c2.addGrade(new Grade(10.0,s4,c2.getName()));
        Catalogul_Meu.addCourse(c2);

        System.out.println("Cursuri: "+Catalogul_Meu.getCourses());
        System.out.println("Notele pentru cursul "+c1.getName()+": "+c1.getAllStudentGrades());
        System.out.println("Notele pentru cursul "+c2.getName()+": "+c2.getAllStudentGrades());

        Catalogul_Meu.addObserver(s1.getMother());
        Catalogul_Meu.addObserver(s1.getFather());
        Catalogul_Meu.addObserver(s2.getMother());
        Catalogul_Meu.addObserver(s3.getFather());
        Catalogul_Meu.addObserver(s4.getMother());
        Catalogul_Meu.addObserver(s4.getFather());
        Catalogul_Meu.removeObserver(s4.getMother());
        for(Course course: Catalogul_Meu.getCourses()){
            for(Grade grade: course.getGrades()){
                Catalogul_Meu.notifyObservers(grade);
            }
        }

    }
}
