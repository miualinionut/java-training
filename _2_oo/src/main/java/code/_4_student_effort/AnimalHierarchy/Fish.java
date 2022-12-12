package code._4_student_effort.AnimalHierarchy;

public class Fish extends Animal implements Pet {

    Fish(){
   super(0);
    }



    @Override
    public void play() {
        System.out.println("pestele se joaca");
    }

    @Override
    public void walk() {
        System.out.println("pestele inoata");
    }

    @Override
    public void eat() {
        System.out.println("pestele mananca");
    }

    @Override
    public String getName() {
       return "ala";
    }

    @Override
    public void setName(String name) {

    }
}

