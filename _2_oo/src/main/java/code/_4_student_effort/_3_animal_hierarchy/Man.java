package code._4_student_effort._3_animal_hierarchy;

public class Man extends Animal{
    public Man(){
        super(2);
    }

    @Override
    public void eat() {
        System.out.println("Man has eaten...");
    }
    
    public void eat(Animal prey){
        System.out.println("Man has eaten an animal with " +prey.legs + " legs...");
    }
    
    public void kill(Animal prey){
        System.out.println("Man has killed an animal with " +prey.legs + " legs...");
    }
    
    public void kill(Man man){
        System.out.println("Man has killed a man... they both had " + man.legs + " legs...");
    }
}
