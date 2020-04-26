package code._4_student_effort;

import java.util.Scanner;

public class TestAnimals {



    public static void main(String[] args) {

        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.setName("Aurel");
        System.out.println("The fish "+ d.getName() + ":");
        d.eat();
        d.play();
        d.walk();

        System.out.println("The cat "+ c.getName() + ":");
        c.eat();
        c.play();
        c.walk();


        System.out.println("The animal fish :");
        a.eat();
        a.walk();

        System.out.println("The spider :");
        e.eat();
        e.walk();

        System.out.println("The pet cat :");
        p.play();

        Animal aux;
        Integer choice=(new Scanner(System.in)).nextInt();
        if(choice%2==0){
            aux=new Cat("George");
        }
        else{
            aux=new Fish();
        }
        aux.walk();

        Pet pe=(Pet)aux;
        pe.play();

        Cat c1=new Cat("Leonor");
        c1.eat();


    }
}
