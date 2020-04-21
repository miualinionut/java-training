package code._4_student_effort._4_pair3;

import java.util.Arrays;

public class CountOfThree {
    public static int getNumber(int[] arr){
        Integer count = 0;

        Integer[] freqNr = new Integer[arr.length];

        Arrays.fill(freqNr, 0);

        for(int i = 0; i < arr.length - 2; i++){
            for(int j = i + 1; j < arr.length - 1; j++){
                for(int k = j + 1; k < arr.length; k++){
                    for(int l = 0; l < freqNr.length; l++){
                        if(((arr[i] + arr[j] + arr[k]) == 0)&&(freqNr[i] == 1)&&(freqNr[j] == 1) &&(freqNr[k] == 1)){
                            count++;
                            freqNr[i] = 1;
                            freqNr[j] = 1;
                            freqNr[k] = 1;
                        }
                    }
                }
            }
        }

        return count;
    }
}
