package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public class ZigZag {
    List<Integer> arr;

    public ZigZag() {
        arr = new ArrayList<>();
    }

    public void insert(Integer element) {
        arr.add(element);
    }

    public static List<Integer> swap(List<Integer> arr, int index1, int index2) {
        int temp = arr.get(index1);
        arr.set(index1, arr.get(index2));
        arr.set(index2, temp);

        return arr;
    }

    public void zigZag() {
        // a < b > c => in first operation 'smaller' needs to be true
        boolean smaller = true;

        for (int i = 0; i < arr.size() - 2; i++) {
            if (smaller) {
                if (arr.get(i) > arr.get(i + 1)) {
                    arr = swap(arr, i, i + 1);
                }
            } else {
                if (arr.get(i) < arr.get(i + 1)) {
                    arr = swap(arr, i, i + 1);
                }
            }
            smaller = !smaller;
        }
    }

    public static void main(String[] args) {

        ZigZag z = new ZigZag();
        for (int i = 1; i <= 10; i++) {
            z.insert(i);
        }
        z.zigZag();

        System.out.println(z.arr);
    }
}
