package code._4_student_effort.GenericIterator;

public class ArrayIterator<T> implements IArrayIterator<T> {
    private T[] array;
    private int index = 0;

    @Override
    public boolean hasNext(){
        if(index < array.length) {
            return true;}
        return false;
    }

    @Override
    public T next(){
        return array[index++];
    }

    public ArrayIterator(T[] array){
        this.array = array;
    }
}
