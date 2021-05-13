package code._4_student_effort;

import java.util.Arrays;

public class CodeChallenge4 {
    public static void main(String[] args) {
        int[] arr = {-1, -1, -1, 2};

        System.out.println(Arrays.toString(arr));
        getNrPairs(arr);
    }

    public static void getNrPairs(int[] array){
        int nr_pairs = 0; // counter for pairs
        int n = array.length;

        // check each number with all to its right
        for(int i = 0; i < n - 2; i++){
            for(int j = i + 1; j < n - 1; j++){
                for(int k = i + 2; k < n; k++){
                    // get the sum of 3 numbers to check the requirement for pairs (their sum is 0)
                    int sum = array[i] + array[j] + array[k];
                    // if the requirement is satisfied increment counter
                    if(sum == 0){
                        nr_pairs++;
                        // if the 3 numbers are not consecutive, bring the second one next to the first one
                        if(j != i + 1){
                            int aux = array[i + 1];
                            array[i + 1] = array[j];
                            array[j] = aux;
                        }
                        // if the 3 numbers are not consecutive, bring the third one next to the second one
                        if(k != i + 2){
                            int aux = array[i + 2];
                            array[i + 2] = array[k];
                            array[k] = aux;
                        }
                        // increment i to skip the second and third number of this pair
                        i += 2;
                        // stop the third for if the pair is found
                        break;
                    }
                }
                // stop the second for if the pair is found
                if(j < i){
                    break;
                }
            }
        }

        System.out.println(nr_pairs);
    }
}
