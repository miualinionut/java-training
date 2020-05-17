package code._4_student_effort.Pairs;

public class Heels implements Shoe {
    private String color;
    private int size;

    public Heels(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String getColor(){
        return color;
    }
    @Override
    public int getSize(){
        return size;
    }
    @Override
    public String toString(){
        return  getColor() + getSize();
    }
}
