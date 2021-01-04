package code._4_student_effort.Pairs;

public class Pair<T extends Shoe> {
    private T first;
    private T second;
    public Pair(T firstElement, T secondElement){
        this.first = firstElement;
        this.second = secondElement;
        match(first,second);
    }

    public T getFirst(){return first;}
    public T getSecond(){return second;}

    private void match(T first, T second){
        if(first.getSize()!= second.getSize()) throw new SizesDoNotMatch("Sizes do not match.");
        if(!first.getColor().equals(second.getColor())) throw new ColorsDoNotMatch("Colors do not match.");
    }
}
