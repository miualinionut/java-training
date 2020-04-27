package code._4_student_effort.Animal_Hierarchy;

public class TestAnimals {
    public static void main(String[] args){
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal s = new Spider();
        Pet p = new Cat();

        d.eat();
        d.setName("Azorel");
        System.out.println(d.getName());
        d.walk();
        d.play();

        c.eat();
        System.out.println(c.getName());
        c.setName("Puffy");
        System.out.println(c.getName());
        c.walk();
        c.play();

        a.eat();
        a.walk();

        s.eat();
        s.walk();

        p.setName("Lola");
        System.out.println(p.getName());
        p.play();
    }
}
