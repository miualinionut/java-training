package code._4_student_effort;

public class ArrayCustomIterator {
    private int[] arr;
    private int pos;

    public ArrayCustomIterator(int[] v){
        this.arr = v;
        this.pos = 0;
    }

    public boolean hasNext(){
        if(pos == arr.length){
            return false;
        }
        return true;
    }
    public int next(){
        return ++pos;
    }
}
