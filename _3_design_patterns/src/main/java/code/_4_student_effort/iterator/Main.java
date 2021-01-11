package code._4_student_effort.iterator;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
