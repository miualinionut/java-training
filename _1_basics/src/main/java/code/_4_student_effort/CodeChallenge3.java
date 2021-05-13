package code._4_student_effort;

import java.util.Arrays;

public class CodeChallenge3 {
    public static void main(String[] args) {
        int[] arr1 = {3, 2, -3, -2, 3, 0};
        int[] arr2 = {1, 1, 0, -1, -1};
        int[] arr3 = {5, 9, -5, 7, -5};

        System.out.println(Arrays.toString(arr1));
        getNrPairs(arr1);
        System.out.println("\n" + Arrays.toString(arr2));
        getNrPairs(arr2);
        System.out.println("\n" + Arrays.toString(arr3));
        getNrPairs(arr3);
    }

    public static void getNrPairs(int[] array){
        int nr_pairs = 0; // counter for pairs
        int n = array.length;

        // check each number with all to its right
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                // get the sum of 2 numbers to check the requirement for pairs (their sum is 0)
                int sum = array[i] + array[j];
                // if the requirement is satisfied increment counter
                if(sum == 0){
                    nr_pairs++;
                    // if the 2 numbers are not consecutive, bring the second one next to the first one
                    if(j != i + 1){
                        int aux = array[i + 1];
                        array[i + 1] = array[j];
                        array[j] = aux;
                    }
                    // increment i to skip the second number of this pair
                    i++;
                    // stop the second for if the pair is found
                    break;
                }
            }
        }

        System.out.println(nr_pairs);
    }
}
