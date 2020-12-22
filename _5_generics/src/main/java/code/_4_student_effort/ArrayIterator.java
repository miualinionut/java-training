package code._4_student_effort;

public class ArrayIterator<T> implements IArrayIterator<T> {
    public T[] arr;
    public int index;

    public ArrayIterator(T[] arr) {
        this.arr = arr;
        this.index = 0;
    }

    public boolean hasNext(){
        if(this.index < this.arr.length)
            return true;
        else return false;
    }
    public T next(){
        return this.arr[index++];
    }
}
