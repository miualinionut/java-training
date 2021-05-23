package code._4_student_effort.AnimalHierarchy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();
        d.eat();
        d.getName();
        d.walk();
        c.walk();
        e.walk();
        p.play();
        List<Animal> list = new ArrayList<>();


    }

}
