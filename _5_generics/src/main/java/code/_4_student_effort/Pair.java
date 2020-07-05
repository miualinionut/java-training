package code._4_student_effort;

// the same type, but needs to be a shoe
public class Pair<T extends Shoe> {
    private T first;
    private T second;

    public Pair(T firstElement, T secondElement) {
        first = firstElement;
        second = secondElement;
        checkPair(first, second);
    }

    public Object getFirst() {
        return first;
    }

    public Object getSecond() {
        return second;
    }

    private void checkPair(T shoe1, T shoe2) {
        if (shoe1.getSize() != shoe2.getSize()) {
            throw new SizesDoNotMatchException("Wrong size");
        } else if (!shoe1.getColor().equals(shoe2.getColor())) {
            throw new ColorsDoNotMatchException("Wronk color");

        }
    }


}
