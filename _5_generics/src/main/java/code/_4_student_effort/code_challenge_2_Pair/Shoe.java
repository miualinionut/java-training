package code._4_student_effort.code_challenge_2_Pair;

public abstract class Shoe {
    private String color;
    private int size;

    public Shoe(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }
}
