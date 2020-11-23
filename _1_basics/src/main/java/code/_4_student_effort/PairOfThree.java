package code._4_student_effort;

import java.util.HashMap;

public class PairOfThree {
    public static void main(String[] args) {
        HashMap<Integer, Integer> values = new HashMap<Integer, Integer>();
        int v[] = {2, -1, -1, -1};
        int pairs = 0;
        for (int i = 0; i < v.length; i++) {
            values.put(v[i], i);
        }
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = i + 1; j < v.length; j++) {
                int dif = -(v[i] + v[j]);
                if (values.containsKey(dif) && values.get(dif) != i && values.get(dif) != j) {
                    values.remove(dif);
                    values.remove(v[i]);
                    values.remove(v[j]);
                    pairs++;
                    break;
                }
            }
        }
    }
}
