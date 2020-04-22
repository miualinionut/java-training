package code._4_student_effort.Challenge3;

import java.util.Arrays;
import java.util.HashMap;

public class PairOf2 {
    static int findNoPairs(int arr[], int n, int sum)
    {
        HashMap<Integer, Integer> firstSum = new HashMap<>();

        int res = 0;
        int lastSum = 0;

        for (int i = 0; i < n; i++) {

            lastSum += arr[i];
            if (lastSum == sum)
                res++;
            if (firstSum.containsKey(lastSum - sum))
                res += firstSum.get(lastSum - sum);

            Integer count = firstSum.get(lastSum);
            if (count == null)
                firstSum.put(lastSum, 1);
            else
                firstSum.put(lastSum, count+1);
        }

        return res;
    }

    public static void main(String []args){

        int arr[] = { -15,-2,2,15,20};
        int sum = 0;
        int n = arr.length;
        System.out.println(findNoPairs(arr, n, sum));
    }
}
