package code._4_student_effort.AnimalHierarchy;

public class Spider extends Animal{

    public Spider() {
        super(8);
    }

    @Override
    public void eat(){
        System.out.println("Spider is eating");
    }
}
