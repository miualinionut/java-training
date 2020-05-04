package code._4_student_effort._1_iterator_code_challenge;

public class Main {

    public static void main(String[] args) {
        // Display of first code challenge (Iterator)
        int[] arr = new int[]{1, 2, 3};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
