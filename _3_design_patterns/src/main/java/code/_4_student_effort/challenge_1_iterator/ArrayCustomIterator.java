package code._4_student_effort.challenge_1_iterator;

public class ArrayCustomIterator {

    int[] arr;
    int index;
    ArrayCustomIterator(int[] arr)
    {
        this.arr = arr;
        index = 0;
    }

    boolean hasNext() {
        return index < arr.length;
    }

    int next() {
        return arr[index++];
    }
}
