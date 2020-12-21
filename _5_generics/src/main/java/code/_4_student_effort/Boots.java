package code._4_student_effort;

public class Boots implements Shoes{
    private String color;
    private int size;

    public Boots(String color, int size){
        this.color = color;
        this.size = size;
    }

    @Override
    public String getColor(){
        return color;
    }

    @Override
    public  int getSize(){
        return size;
    }
}
