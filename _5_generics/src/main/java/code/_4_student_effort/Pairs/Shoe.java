package code._4_student_effort.Pairs;

public interface Shoe {
    String getColor();
    int getSize();
    default boolean sameColor(String color2){
        if(this.getColor().compareTo(color2)== 0)
            return true;
        return  false;
    }
    default boolean sameSize(int size2){
        if(this.getSize() == size2) return true;
        return false;
    }

}
