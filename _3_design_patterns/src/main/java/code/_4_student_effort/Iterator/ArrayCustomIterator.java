package code._4_student_effort.Iterator;


public class ArrayCustomIterator {
    public int[] arr;
    public int index = 0;


    public ArrayCustomIterator(int arr[], int index) {
        this.arr = arr;
        this.index = index;
    }

    public boolean hasNext() {
        if (this.index >= this.arr.length || this.arr[this.index] == 0) return false;
        else return true;
    }

    public int next() {
        return this.arr[this.index++];
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3,4 ,5 ,6};
        ArrayCustomIterator it = new ArrayCustomIterator(arr, 0);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
