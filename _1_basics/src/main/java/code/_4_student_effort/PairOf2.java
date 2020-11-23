package code._4_student_effort;

import java.util.Arrays;

public class PairOf2 {
   public static int countPairs(int[] numbers){
    int count = 0;
    int i = 0;
    int len = numbers.length-1;
    sortArray(numbers);
    while(i<len){
        if(numbers[i]+numbers[len]>0){
            len--;
        }
        else if (numbers[i]+numbers[len]<0){
            i++;
        }
        else if (numbers[i]+numbers[len]==0) {
            count++;
            len--;
            i++;}
    }
    return count;
    }

    private static void sortArray(int[] numbers){
       int temp;
       for(int i = 0; i< numbers.length-1; i++){
           for (int j = i+1; j<numbers.length; j++){
               if(numbers[i] > numbers[j]){
               temp = numbers[i];
               numbers[i] = numbers[j];
               numbers[j] = temp;}
           }
       }
    }
}
