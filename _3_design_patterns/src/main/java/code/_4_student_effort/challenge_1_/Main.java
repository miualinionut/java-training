package code._4_student_effort.challenge_1_;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);

        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();
    }
}
