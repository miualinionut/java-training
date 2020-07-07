package code._4_student_effort;
public class Boot implements Shoe {
    private String color;
    private double size;

    public Boot(String color, double size) {
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