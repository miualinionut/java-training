package code._4_student_effort;

public class ArrayCustomIterator {
    int[] arr;
    int idx;

    ArrayCustomIterator(int[] arr) {
        this.arr = arr;
    }

    public boolean hasNext() {
        return (idx < arr.length);
    }

    public  int next() {
        return arr[idx++];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
