package code._4_student_effort;

public class ArrayCustomIterator {
    private int[] arr;
    private int Index;

    public ArrayCustomIterator(int arr[]) {
        this.arr = arr;
        this.Index = 0;
    }

    public int next() {
        return this.arr[this.Index++];

    }

    public boolean hasNext() {
        if (this.Index < this.arr.length)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
