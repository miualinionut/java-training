package code._4_student_effort.Challenge_3;

public class Main {
    public static void main(String[] args) {
        Fish d=new Fish();
        Cat c=new Cat("Fluffy");
        Animal a=new Fish();
        Animal e=new Spider();
        Pet p=new Cat();

        //a. Calling the methods in each object
        //Test Spider
        e.eat();
        e.walk();

        //test Cat (Cat)
        c.eat();
        c.play();
        c.setName("Lulu");
        System.out.println(c.getName());
        c.walk();

        //test Cat (Pet)
        /*p.eat();   //interfata Pet nu are metoda eat()*/
        p.play();
        p.setName("Fifi");
        System.out.println(c.getName());
        /*p.walk();    //interfata Pet nu are metoda walk()*/

        //test Fish (Fish)
        d.eat();
        d.play();
        d.walk();
        d.setName("Nemo");
        System.out.println(d.getName());

        //test Fish (Animal)
        a.eat();
        a.walk();
       /* a.play();
        a.setName("Nemo");
        System.out.println(a.getName()); */   //clasa abstracta Animal nu are metodele play(), setName(), getName()

        //b. Casting objects
        ((Cat)p).eat();   //cast de la Pet la Cat pentru acces la metoda eat()
        ((Cat)p).walk();   //cast de la Pet la Cat pentru acces la metoda walk()

        ((Fish)a).play();  //cast de la Animal la Fish pentru acces la metoda play()
        ((Fish)a).setName("Dory");   //cast de la Animal la Fish pentru acces la metoda setName()
        System.out.println(((Fish)a).getName());   //cast de la Animal la Fish pentru acces la metoda getName()

        //c. Using polymorphism   //rezultate diferite in functie de obiectul care face apelul
        e.walk();   //neimplementata in Spider, dar mostenita din Animal
        c.walk();
    }
}
