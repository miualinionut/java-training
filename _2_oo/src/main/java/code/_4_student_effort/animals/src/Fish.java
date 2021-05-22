public class Fish extends Animal{
    @Override
    public void walk() {
        System.out.println("Fish can't walk and don't have legs");   }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Fish is eating ");
    }
}
