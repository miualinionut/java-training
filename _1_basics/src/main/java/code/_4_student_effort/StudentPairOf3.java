package code._4_student_effort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

//Pair of 3??!!

public class StudentPairOf3 implements Command {
    /**
     * Take in an array of strings and return an array of integers
     */
    static int[] converToInt(String[] data) {
        int[] arr = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            arr[i] = Integer.parseInt(data[i]);
        }
        return arr;
    }

    /**
     * We iterate every number in the integer array.
     * We use the number as a target to find two other numbers which make total zero.
     * For those two other numbers, we move pointers, l and r, to try them.
     * This way, complexity drops to O(n**2) from O(n**3).
     */
    static int computePairs(int[] arr, int maxLimit) {
        boolean found = false;
        int pairs = 0;
        // sort array elements
        Arrays.sort(arr);

        for (int i = 0; i < maxLimit - 1; i++) {
            // initialize left and right
            int l = i + 1;
            int r = maxLimit - 1;
            int x = arr[i];
            while (l < r) {
                if (x + arr[l] + arr[r] == 0) {
                    //if sum is 0, we found a pair
                    pairs++;
                    l++;
                    r--;
                    found = true;
                }
                // If sum of three elements is less
                // than zero then increment in left
                else if (x + arr[l] + arr[r] < 0)
                    l++;
                    // if sum is greater than zero than
                    // decrement in right side
                else
                    r--;
            }
        }

        if (!found)
            return -1;
        return pairs;
    }

    public void exec(int maxLimit) {
        int pairs = -1;
        try {
            String currDir = System.getProperty("user.dir") + "/_1_basics/src/main/java/code/_4_student_effort/StudentPairOf3.txt";
            File myObj = new File(currDir);
            Scanner myReader = new Scanner(myObj);
            String[] data = myReader.nextLine().split(" ");
            int[] array = converToInt(data);
            pairs = computePairs(array, maxLimit);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }
        System.out.println(pairs);
    }
}
