package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public class Threes {
    private static int pairs = 0;

    public static void main(String[] args) {
        // modify the input here
        int[] input = {-1, -1, -1, 2, -1, 2};

        // using a list to simplify the process of eliminating pairs
        List<Integer> num = new ArrayList<>();
        for(int i = 0; i < input.length; i++)
            num.add(input[i]);

        for(int i = 0; i < num.size(); i++) {
            Boolean check = false;
            System.out.println(num);
            for(int j = i + 1; j < num.size(); j++) {
                for(int k = j + 1; k < num.size(); k++) {
                    if (num.get(i) + num.get(j) + num.get(k) == 0) {
                        num.remove(i);
                        num.remove(j - 1);
                        num.remove(k - 2);

                        pairs++;
                        // reset the first loop and break the current one
                        i = -1;
                        check = true;
                        break;
                    }
                    if(check)
                        break;
                }
            }
        }

        System.out.println(pairs);
    }
}
