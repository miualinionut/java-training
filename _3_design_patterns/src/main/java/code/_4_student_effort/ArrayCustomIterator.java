package code._4_student_effort;

public class ArrayCustomIterator {

    private int[] arr;
    private int currentIndex;

    public ArrayCustomIterator(int arr[]){
        this.arr = arr;
        this.currentIndex = 0;

    }

    int next(){

        return this.arr[this.currentIndex++];
    }
    boolean hasNext(){
        return this.currentIndex < this.arr.length ? true : false;

    }
}
