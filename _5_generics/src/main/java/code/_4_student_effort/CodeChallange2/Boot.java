package code._4_student_effort.CodeChallange2;

public class Boot implements Shoe{
    private String color;
    private int size;

    public Boot(String color, int size){
        this.color = color;
        this.size = size;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getSize() {
        return this.size;
    }
}
