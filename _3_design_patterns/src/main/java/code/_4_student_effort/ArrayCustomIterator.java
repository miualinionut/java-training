package code._4_student_effort;

public class ArrayCustomIterator {

    private int[] arr; // argument "arr" care este de tip int[], adica lista
    private int myIterator;


    public boolean hasNext(){
        return this.myIterator < this.arr.length;
    }

    public int next(){
        return this.arr[this.myIterator++];
    }

    public ArrayCustomIterator(int[] arr) {
        this.arr = arr;
        this.myIterator = 0;
    }
}
