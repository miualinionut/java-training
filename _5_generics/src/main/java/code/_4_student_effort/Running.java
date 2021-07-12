package code._4_student_effort;

public class Running implements Shoe{

    String color;
    double size;

    public Running(String color, double size){
        color=color;
        size=size;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getSize() {
        return size;
    }

}
