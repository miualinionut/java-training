package code._4_student_effort._2_pairs;

public class Pair<T extends Shoe> {
    private final T first;
    private final T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
        checkMatch();
    }

    private void checkMatch(){
        if(!first.getColor().equals(second.getColor())){
            throw new ColorsDoNotMatchException();
        }
        if(!first.getSize().equals(second.getSize())){
            throw new SizeDoNotMatchException();
        }
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}

