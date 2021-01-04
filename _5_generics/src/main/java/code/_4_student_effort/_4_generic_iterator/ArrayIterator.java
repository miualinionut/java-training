package code._4_student_effort._4_generic_iterator;

public class ArrayIterator<T> implements IArrayIterator<T> {

    T[] array;
    int index;

    public ArrayIterator(T[] array) {
        this.array = array;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public T next() {
        return array[index++];
    }
}
