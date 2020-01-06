public class Giraffe extends Animal {
    Giraffe(String name , int age){
        this.name = name ;
        this.age = age ;

    }
    @Override
    public void eat(){ System.out.println("Giraffe eats leafs");}
    public void sleep(){System.out.println("Sleeps 16 hours");}
    public void sayWhatType() {
        System.out.println("IERBIVOR");
    }

    public void present(){
        System.out.println("Giraffe: " + this.name);
        System.out.println("Age: " + this.age);
        eat() ;
        sleep();


    }


}
