package code._4_student_effort.iterator;

import code._2_challenge._1_iterator.ArrayCustomIterator;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        code._2_challenge._1_iterator.ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
