package code._4_student_effort.challenge_3;

public class Spider extends Animal{
    public Spider(Integer legs) {
        super(legs);
    }

    @Override
    public void eat() {
        System.out.println("Eating the insects caught in my web!");
    }
}
