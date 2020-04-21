package code._4_student_effort._4_pair3;

import code._4_student_effort._3_pair2.GetCount;

public class PairOfThree {
    public static void main(String[] args) {
        int[] arr = new int[]{-1, -1, -1, 2};

        Integer count  = GetCount.getNumber(arr);
        System.out.println(count);
    }

}

