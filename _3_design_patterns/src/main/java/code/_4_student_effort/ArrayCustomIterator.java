package code._4_student_effort;

public class ArrayCustomIterator {

    private int arr[];
    private int i;
    public ArrayCustomIterator(int arr[]) {
        this.arr = arr;
        this.i = 0;
    }
    public boolean hasNext(){

    return this.i < this.arr.length;

    }

    public int next(){

        return this.arr[this.i]++;
    }
    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while (it.hasNext())
            System.out.println(it.next());
    }

}
