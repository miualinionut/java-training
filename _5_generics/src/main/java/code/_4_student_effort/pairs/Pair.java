package code._4_student_effort.pairs;

public class Pair <T extends Shoe> {
    private T first;
    private T second;
    public Pair(T firstElement, T secondElement) {
        isPair(firstElement, secondElement);
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void isPair(T firstElement, T secondElement) {
/*        if (firstElement.getColor().equals(secondElement.getColor()) && firstElement.getSize() == secondElement.getSize()) {
            first = firstElement;
            second = secondElement;
        } else {
            throw new isNotPairException("is not a Pair");
        }*/
        if (!firstElement.getColor().equals(secondElement.getColor())) {
            throw new ColorsDoNotMatchException("different colors");
        } else if (!(firstElement.getSize() == secondElement.getSize())) {
            throw new SizesDoNotMatchException("different sizes");
        } else {
            first = firstElement;
            second = secondElement;
        }
    }

    @Override
    public String toString() {
        return first.getClass().getSimpleName() +" pair" +
                ": size - " + first.getSize() +
                ", color - " + first.getColor();
    }
}
