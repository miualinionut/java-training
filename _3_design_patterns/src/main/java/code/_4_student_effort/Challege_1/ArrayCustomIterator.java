package code._4_student_effort.Challege_1;

public class ArrayCustomIterator {
    protected int[] arr;
    protected int i = -1;

    public ArrayCustomIterator(int[] arr) {
        this.arr = arr;
    }

    public boolean hasNext() {
        if (i + 1 < arr.length)
            return true;
        else return false;
    }

    public int next() {
        return arr[++i];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while (it.hasNext())
            System.out.println(it.next());
    }
}
