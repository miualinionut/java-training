package code._4_student_effort.iterator;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ArrayCustomIterator it = new ArrayCustomIterator(array);
        while (it.hasNext()) {
            System.out.println(it.next());

        }
    }
}
