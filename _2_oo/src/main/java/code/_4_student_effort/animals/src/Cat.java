public class Cat extends Animal implements Pet{
    private String name;

    protected Cat(String name,Integer legs ) {
        //super(legs);
        this.legs = legs;
        this.name = name;
    }

    public Cat(String name) {
        this.name =name;
    }

    public Cat() {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName() {

    }

    @Override
    public void play() {
       System.out.println("Cat "+ name+ " is playing");
    }

    @Override
    public void eat() {
       System.out.println("Cat "+ name + " is eating");
    }

    @Override
    public void walk() {
       System.out.println("Cat "+name+" has " + getLegs()+" legs");
    }
}
