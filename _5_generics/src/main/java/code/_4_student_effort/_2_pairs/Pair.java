package code._4_student_effort._2_pairs;

public class Pair<T extends Shoe> {
    private T first;
    private T second;

    public Pair(T first, T second){
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    private void sameShoes(T first, T second){
        if(first.getSize() != second.getSize())
            System.out.println("Nu au aceeasi marime");

        if(first.getColor() != second.getColor()){
            System.out.println("Nu au aceeasi culoare");
        }
    }
}
