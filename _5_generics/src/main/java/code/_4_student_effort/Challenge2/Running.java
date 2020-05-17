package code._4_student_effort.Challenge2;

public class Running implements Shoe {
    String color;
    int size;

    public Running(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getColor() {
        return color;
    }
}
