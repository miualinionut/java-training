package code._4_student_effort._4_genericIterator;

public class ArrayIterator<T> implements IArrayiterator<T> {
    private T[] arr;
    private int curIndex = 0;

    public ArrayIterator(T[] arr, int curIndex) {
        this.arr = arr;
        this.curIndex = curIndex;
    }

    @Override
    public boolean hasNext() {
        return curIndex < arr.length;
    }

    @Override
    public T next() {
        return arr[curIndex++];
    }
}
