package code._4_student_effort._3_pair2;

import java.util.Arrays;

public class GetCount {
    public static int getNumber(int[] arr){
        Integer count  = 0;

        Integer[] frequencyNumber = new Integer[arr.length];
        Arrays.fill(frequencyNumber, 0);

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                for(int k = 0; k < frequencyNumber.length; k++){
                    if(((arr[i] + arr[j]) == 0)&&(frequencyNumber[i] == 0)&&(frequencyNumber[j] == 0)){
                        count++;
                        frequencyNumber[i] = 1;
                        frequencyNumber[j] = 1;
                    }
                }
            }
        }

        return count;
    }
}
