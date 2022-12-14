package code._4_student_effort.challenge_1_;

public class ArrayCustomIterator {
    private int length, index;
    private int[] array;

    public ArrayCustomIterator(int[] array) {
        length = index =0;

        for(int iterator:array) {
            length++;
        }

        this.array = array;
    }

    public boolean hasNext() {
        return index < length;
    }

    public int next() {
        return array[index++];
    }
}
