package code._4_student_effort;

public class Heels implements Shoe {
    String colour;
    Integer size;

    public Heels(String colour, Integer size){
        this.colour = colour;
        this.size = size;
    }

    @Override
    public Integer getSize() {
        return size;
    }
    @Override
    public String getColour(){
        return colour;
    }
}
