package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public class Pairs {

    private static int pairs = 0;

    public static void main(String[] args) {
        // modify the input here
        int[] input = {5, 9, -5, 7, -5};

        // using a list to simplify the process of eliminating pairs
        List<Integer> num = new ArrayList<>();
        for(int i = 0; i < input.length; i++)
            num.add(input[i]);

        for(int i = 0; i < num.size(); i++) {
            for(int j = i + 1; j < num.size(); j++) {

                if(num.get(i) + num.get(j) == 0) {
                    num.remove(i);
                    num.remove(j - 1);

                    pairs++;
                    // reset the first loop and break the current one
                    i = -1;
                    break;
                }
            }
        }

        System.out.println(pairs);
    }
}
