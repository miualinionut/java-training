package code._4_student_effort.animal_hierarchy;

public class TestAnimals {
    public static void main(String[] args){
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.eat();
        d.setName("Fish");
        System.out.println(d.getName());
        d.walk();
        d.play();

       System.out.println(c.getName());
       c.eat();
       c.play();
       c.walk();

       a.walk();
       a.eat();

       e.walk();
       e.eat();

       p.play();
       p.setName("cat");
       System.out.println(p.getName());

    }
}
