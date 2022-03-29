package code._4_student_effort;


import java.util.Arrays;

public class PairOf2 {
    public static int result(Integer[] numbers){
        // time: O(n)
        // memory: O(n)
        // n = 100 arbitrary chosen meaning numbers in numbers[] have to be <= 100
        // works best for big size of array because it takes little time,
        // but values must be <= a small number so it doesn't take too much memory
        int[] characteristic_array = new int[105];
        int pairs = 0;
        for(int i = 0; i < numbers.length; ++i){
            if(numbers[i] >= 0)
                ++characteristic_array[numbers[i]];
            else{
                int opposite = numbers[i]*(-1);
                if(characteristic_array[opposite] > 0){
                    ++pairs;
                    --characteristic_array[opposite];
                }
            }
        }
        //don't forget pairs of 0!!
        pairs += characteristic_array[0]/2;
        return pairs;

    }

    public static void main(String[] args) {
        Integer[] v = {5,9,-5,7,-5,0,0};
        System.out.println(result(v));
    }
}
