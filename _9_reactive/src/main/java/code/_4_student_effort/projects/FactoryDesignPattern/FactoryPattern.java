package code._4_student_effort.projects.FactoryDesignPattern;

public class FactoryPattern {
    public static void main(String[] args) {

        Person person1 = PersonFactory.getPerson("Adult");
        person1.register();

        Person person2 = PersonFactory.getPerson("Children");
        person2.register();

        Person person3 = PersonFactory.getPerson("Teenager");
        person3.register();

        Person errorperson = PersonFactory.getPerson("Dog");
        errorperson.register();
    }
}

