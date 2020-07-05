package code._4_student_effort;

public class ArrayIterator<T> implements IArrayIterator<T> {
    T[] arr;
    int i = 0;
    public ArrayIterator(T[] arr) {
        this.arr = arr;
    }

    @Override
    public boolean hasNext() {
        return arr.length > i;
    }

    @Override
    public T next() {
        return arr[i++];
    }
}
