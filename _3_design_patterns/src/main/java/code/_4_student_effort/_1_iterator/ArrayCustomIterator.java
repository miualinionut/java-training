package code._4_student_effort._1_iterator;

public class ArrayCustomIterator {
    int[] ints;
    int maxSize;
    int currPos=0;
    public ArrayCustomIterator(int[] ints){
        this.ints= ints;
        this.maxSize = ints.length;
    }
    public boolean hasNext(){
        return currPos<maxSize;
    }
    public int next(){
        return ints[currPos++];
    }
}
