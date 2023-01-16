package code._4_student_effort.challenge3;

import java.util.Arrays;

public class PairOf2 {

    static public Integer pairOf2(Integer[] array)
    {
        Integer[] verifyArray = new Integer[array.length];
        Arrays.fill(verifyArray, 0);

        int i,j;

        Integer countPair = 0;

        for(i = 0; i < array.length - 1; i++) {
            if(verifyArray[i] == 0)
            for (j = i + 1; j < array.length; j++)
            if(verifyArray[j] == 0)
                if(array[i] + array[j] == 0) {

                    countPair++;
                    verifyArray[i]++;
                    verifyArray[j]++;
                }
        }
        return countPair;
    }

    public static void main(String[] args) {

        Integer[] array = {3, 2, -3, -2, 3, 0};

        System.out.println(pairOf2(array));
    }

}
