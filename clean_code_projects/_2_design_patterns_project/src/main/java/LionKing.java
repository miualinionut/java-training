import java.util.Objects;

public class LionKing extends Animal  implements IsKing {
    LionKids ob ;                                       //aici intalnim COMPOZITIE , folosim intr-o clasa un alt obiect de tipul altei clase

    LionKing(String name , int age , LionKids ob){
        this.name = name ;
        this.age = age ;
        this.ob = ob ;
    }
    @Override
    public void eat(){ System.out.println("Lion eats meat");}
    public void sleep(){System.out.println("Sleeps 14 hours");}
    public void sayWhatType() {
        System.out.println("CARNIVORE");
    }


    @Override
    public void ItIs() {
        System.out.println("THE KING") ;

    }
    public void present(){
        System.out.println("Lion: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("LionKids: " + (this.ob).kids);
        eat() ;
        sleep();


    }
}
