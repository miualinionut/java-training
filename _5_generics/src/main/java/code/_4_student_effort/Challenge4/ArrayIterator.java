package code._4_student_effort.Challenge4;

public class ArrayIterator<T> implements IArrayIterator<T> {

    T[] arr;
    int index=0;

    public ArrayIterator(T[] arr) {
        this.arr = arr;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index<arr.length){
            return true;
        }
        return false;
    }

    @Override
    public T next() {
        return arr[index++];
    }
}
