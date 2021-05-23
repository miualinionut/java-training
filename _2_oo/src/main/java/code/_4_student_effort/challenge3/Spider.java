package code._4_student_effort.challenge3;

public class Spider extends Animal{
    int legs;
    Spider(){
        super(8);
    }

    @Override
    void eat() {
        System.out.println("Spider eat");
    }
}
