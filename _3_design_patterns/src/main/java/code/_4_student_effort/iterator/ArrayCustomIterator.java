package code._4_student_effort.iterator;

public class ArrayCustomIterator implements MyIterator {
    private int[] arr;
    private int currentPosition;
    public ArrayCustomIterator(int[] arr) {
        this.arr = arr;
        currentPosition = 0;
    }

    @Override
    public boolean hasNext() {
        if (currentPosition < arr.length) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int next() {
        return arr[currentPosition++];
    }
}
