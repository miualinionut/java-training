package code._4_student_effort.iterator;

public class ArrayCustomIterator implements IteratorCustom {

   private int arr[];
    private int currentIndex;

    ArrayCustomIterator(int arr[]){
        this.arr=arr;
    }

    @Override
    public boolean hasNext() {
        return this.currentIndex < this.arr.length;
    }

    @Override
    public int next() {
        return this.arr[this.currentIndex++];
    }
}
