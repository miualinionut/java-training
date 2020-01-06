



public class Penguin extends Animal {

    Penguin(String name , int age){
        this.name = name ;
        this.age = age ;

    }
    @Override
    public void eat(){ System.out.println("Penguin eats fish");}
    public void sleep(){System.out.println("Sleeps 10 hours");}
    public void sayWhatType() {
        System.out.println("OMNIVOR");
    }

    public void present(){
        System.out.println("Penguin: " + this.name);
        System.out.println("Age: " + this.age);
        eat() ;
        sleep();


    }

}
