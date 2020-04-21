package code._4_student_effort;
import java.util.Arrays;

public class PairOfTwo {
    public static int findPair(int[] arr) {
        boolean[] found = new boolean[arr.length] ;
        int count = 0;
        int n =arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n ; j++)
                if(arr[i] + arr[j] == 0 && !found[i] && !found[j]){
                    found[i] =  found[j] = true;
                    count = count + 1;
                }



return count;
        }
    }
