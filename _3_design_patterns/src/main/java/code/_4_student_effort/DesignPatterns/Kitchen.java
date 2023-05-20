package code._4_student_effort.DesignPatterns;

public class Kitchen {

    Staff staff = new Staff();

    public Kitchen()
    {

    }
    public void notify(Order order)
    {
        this.staff.update();
    }
}
