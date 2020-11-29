package code._4_student_effort;

public class Cat extends Animal implements Pet {

    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat(){
        super(4);
        this.name = "";
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;

    }
    public  void play(){
        System.out.println("you play with the cat");
    }

    public void eat(){
        System.out.println("the cat eats");
    }

}
