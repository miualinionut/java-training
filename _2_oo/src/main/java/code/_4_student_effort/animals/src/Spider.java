public class Spider extends Animal{

    public Spider(Integer legs) {
        super(legs);
    }

    public Spider() {

    }

    @Override
    public void walk() {
        System.out.println("Spiders has "+ getLegs());
    }

    @Override
    public void eat() {
        System.out.println("Spiders eats insects");
    }
}
