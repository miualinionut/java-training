package code._4_student_effort.challenge3;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d=new Fish();
        Cat c=new Cat("fluffy");
        Animal a=new Fish();
        Animal e=new Spider();
        Pet p= new Cat();

        d.eat();
        d.setName("Fish1");
        System.out.println(d.getName());
        d.play();
        d.walks();

        c.setName("fluffy2");
        System.out.println(c.getName());
        c.eat();
        c.play();
        c.walks();

        a.walks();
        a.eat();

        e.walks();
        e.eat();

        p.setName("pet1");
        System.out.println(p.getName());
        p.play();







    }

}
