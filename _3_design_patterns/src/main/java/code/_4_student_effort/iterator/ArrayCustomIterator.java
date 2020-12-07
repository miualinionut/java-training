package code._4_student_effort.iterator;

public class ArrayCustomIterator {
    int[] arr;
    int index = 0;
    int size;
    public ArrayCustomIterator(int[] arr){
        this.arr=arr;
        this.size=arr.length;
    }
    public boolean hasNext(){
        return index<size;
    }
    public int next(){
        return arr[index++];
    }
}
