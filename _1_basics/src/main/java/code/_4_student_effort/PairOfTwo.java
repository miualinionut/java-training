package code._4_student_effort;

import java.util.ArrayList;
import java.util.Collections;

public class PairOfTwo {

    int pairs (ArrayList<Integer> array) {
        int number = 0;
        int lastIndex = array.size() - 1;
        int firstIndex = 0;
        // sort the elements of ArrayList in ascending order
        Collections.sort(array);

        while (firstIndex < lastIndex) {
            if (Math.abs(array.get(firstIndex)) == Math.abs(array.get(lastIndex))) {
                number++;
                firstIndex++;
                lastIndex--;
            } else if (Math.abs(array.get(firstIndex)) <= Math.abs(array.get(lastIndex))) {
                lastIndex--;
            } else {
                firstIndex++;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        PairOfTwo test = new PairOfTwo();

        ArrayList<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(9);
        array.add(-5);
        array.add(7);
        array.add(-5);
        array.add(-10);

        System.out.println(test.pairs(array));
    }
}
