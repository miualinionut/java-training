package code._4_student_effort.Iterator;

public class ArrayCustomIterator {
    private final int[] arr;
    private int index;

    public ArrayCustomIterator(int arr[]){
        this.arr = arr;
        this.index = 0;
    }

    public boolean hasNext(){return this.index < this.arr.length;}
    public int next(){return this.arr[this.index++];}

    public  static void main(String[] args){
        int[] arr = new int[] {1,2,3};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while(it.hasNext()){
            System.out.print(it.next());
        }
    }
}
