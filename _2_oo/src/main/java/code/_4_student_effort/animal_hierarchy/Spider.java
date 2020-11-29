package code._4_student_effort.animal_hierarchy;

public class Spider extends Animal{

    public Spider(Integer legs) {
        // all spiders has eight legs
        super(legs);
    }

    @Override
    public void eat() {
        System.out.println("The spider eats mosquitoes");
    }

}
