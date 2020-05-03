package code._4_student_effort;

public class ArrayCustomIterator {

    private int[] workingArray;
    private int currentIndex;

    public ArrayCustomIterator(int[] workingArray) {
        this.workingArray = workingArray;
        this.currentIndex = 0;
    }

    boolean hasNext() {
        return workingArray.length != currentIndex;
    }

    int next() {
        return workingArray[currentIndex++];
    }
}
