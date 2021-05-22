public class TestAnimals {
   public static void main(String args[]) {
       Fish d = new Fish();
       Cat c = new Cat("Fluffy", 4);
       Animal a = new Fish();
       Animal e = new Spider(8);
       Pet p = new Cat("Fluffy");

       d.walk();
       d.eat();
       c.eat();
       c.play();
       c.walk();
       a.walk();
       a.eat();
       e.walk();
       e.eat();
       p.play();

   }
}
