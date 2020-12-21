package code._4_student_effort;

public class Socks {
    private  String color;
    private int size;

    public Socks(String color, int size){
        this.color = color;
        this.size = size;
    }

    public String getColor(){
        return color;
    }

    public int getSize(){
        return size;
    }

    @Override
    public String toString(){
        return "Socks with color: " + color +  "and size: " + size;
    }
}
