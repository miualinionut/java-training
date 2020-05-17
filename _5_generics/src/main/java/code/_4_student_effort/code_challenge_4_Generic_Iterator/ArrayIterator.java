package code._4_student_effort.code_challenge_4_Generic_Iterator;

public class ArrayIterator<T> implements IArrayIterator<T> {

    private T[] array;
    private int currentPosition = 0;

    public ArrayIterator(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < array.length;
    }

    @Override
    public T next() {
        return array[currentPosition++];
    }
}
