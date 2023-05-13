package code._4_student_effort;

public class Wall implements Obstacle{
    @Override
    public void avoid() {
        System.out.println("Climbing over the wall!");
    }
}
