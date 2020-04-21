package code._4_student_effort;

import java.util.Arrays;

public class PairOf2 {

    public static Integer nrPairs(Integer [] arr){

        int nr=0;
        Arrays.sort(arr);
        int left=0,right=arr.length-1;
        while(left<right){

            if(Math.abs(arr[left])==arr[right]) {
                nr++;
                left++;
                right--;
            }
            else if(Math.abs(arr[left])>=arr[right]) left++;
            else right--;


        }
        return nr;

    }

}
