package code._4_student_effort.AnimalHierarchy;

public class TestAnimals {
    public static void main(String[] args){
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.setName("Poseidon");
        System.out.println("The fish is named: " + " "+ d.name + " ");
        d.walk();
        c.eat();
        c.play();
        a.eat();
        e.walk();
        p.setName("Simba");
        p.play();

    }
}
