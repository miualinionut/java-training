package code._4_student_effort;

public class TestAnimals {
    public static void main(String[] args) {


        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();
        //calling the methods in each object
        //Fish
        d.eat();
        d.play();

        //Cat
        c.eat();
        c.walk();
        c.play();

        //Fish(Animal)
        a.walk();
        a.eat();
        //Spider
        e.eat();
        e.walk();
        //Cat(Pet)
        p.play();
        p.setName("Dolly");
        System.out.println(d.getName());
        //casting objects
        ((Cat)p).eat();//am facut cast de la Pet la Cat ca sa putem  accesa metoda respectiva
        ((Cat)p).walk();
        //polymorphism
        //nu se regasesc in Spider si Cat, dar sunt mostenite din Animal
        e.walk();
        c.walk();
    }
}
