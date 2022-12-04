package code._4_student_effort._Animal_Hierarchi_;

public class Fish extends Animal implements Pet {
     String name;
    public Fish(){
       super(0);
       //System.out.println("The fish doesn't have legs");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void play(){
        System.out.println("The fish is playing");
    }
    public void walk(){

        System.out.println("The fish can't walk");
    }
    public void eat(){
        System.out.println("The fish is eating");
    }
}
