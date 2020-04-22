package code._4_student_effort;

import java.util.Arrays;

public class PairOf2 {

    public static void(String[] args, int[] arr,int[] givenArray, int givenSum)
    {
        int count=0;
        Integer FreqNr=new Integer[arr.lenght];
        Arrays.fill(FreqNr,0);
        for(int i=1; i<= arr.lenght; i++){
        for(int j=i+1; j<arr.lenght; j++){
            for(int k=0; k<FreqNr.lenght; k++){
                    if (((arr[i] + arr[j]) == 0) && (FreqNr[i] == 0) && (FreqNr[j] == 0)) {
                        count++;
                        FreqNr[i] += 1;
                        FreqNr[j] += 1;

                    }
            }
        }
        }

        return count;
        System.out.println("Given array : " + Arrays.toString(givenArray));
        System.out.println("Given sum : " + givenSum);
        System.out.println("Integer numbers, whose sum is equal to value : " + givenSum);
        printPairs(givenArray, givenSum);

    }
}
