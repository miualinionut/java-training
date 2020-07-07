package code._4_student_effort;
public class Heels implements Shoe {
    private String color;
    private double size;

    public Heels(String color, double size) {
        this.color = color;
        this.size = size;
    }
    @Override
    public double getSize() {
        return size;
    }

    @Override
    public String getColor() {
        return color;
    }
}
