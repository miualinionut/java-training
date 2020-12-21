package code._4_student_effort;

public class Gloves {
    private  String color;
    private int size;

    public Gloves(String color, int size){
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
        return "Gloves with color: " + color +  "and size: " + size;
    }
}
