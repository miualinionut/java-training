package code._4_student_effort.tema2.Challenge3;

import java.util.ArrayList;
import java.util.List;

public class TestAnimals {

    public static void main(String[] args) {

        Cat c = new Cat("Fluffy");
        Animal e = new Spider();
        e.eat(); //apelare din Spider
        e.walk(); //apelare din spider

        Pet p = new Cat();
        p.play(); //comportament redus la cel din interfata Pet
        System.out.println( p.getName());

        c.eat();
        c.play();
        System.out.println(c.getName());

        //UPCASTING:
        Fish d = new Fish();
        Animal a = new Fish();
        d.walk(); //apelare din Fish -> dupa tipul obiectului
        a.walk(); //apelare din Fish -> dupa tipul obiectului
        d.eat();
        a.eat();

        d.getLegs();
        d.eat();

        ArrayList<Animal> lista = new ArrayList<>();
        //UPCASTING:
        lista.add(e);
        lista.add(d);
        lista.add(c);

        //DOWNCASTING:
        Cat cat = (Cat) lista.get(2); // de la animal la cat
        cat.play();
        System.out.println(cat.getName());
        cat.eat();
        cat.walk();

      //  Cat cat2 = (Cat) lista.get(1); nu se poate converti in pisica pt ca nu a fost niciodata pisica

    }
}
