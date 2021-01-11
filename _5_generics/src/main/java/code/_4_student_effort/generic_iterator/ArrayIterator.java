package code._4_student_effort.generic_iterator;

public class ArrayIterator<T> implements IArrayIterator<T>{
    private T[] arr;
    private int index = 0;
    public ArrayIterator(T[] arr) {
        this.arr = arr;
    }

    @Override
    public boolean hasNext() {
        return index < arr.length;
    }

    @Override
    public T next() {
        return arr[index++];
    }
}
