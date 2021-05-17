package code._4_student_effort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class StudentPairOf3 implements Command {
    List<Integer> visited = new ArrayList<>();

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
     * Add all the integers to visited list
     * The elements from these positions in the array will be considered visited
     */
    void doVisit(int index1, int index2, int index3) {
        visited.add(index1);
        visited.add(index2);
        visited.add(index3);
    }

    /**
     * Verify if any of the indexes has been visited/ used in the algorithm
     */
    boolean isVisited(int index1, int index2, int index3) {
        return visited.contains(index1) || visited.contains(index2) || visited.contains(index3);
    }

    /**
     * We iterate every number in the integer array.
     * We use the number as a target to find two other numbers which make total zero.
     * For those two other numbers, we move pointers, l and r, to try them.
     * This way, complexity drops to O(n**2) from O(n**3).
     */
    int computePairs(int[] arr, int maxLimit) {
        boolean found = false;
        int pairs = 0;
        // sort array elements
        Arrays.sort(arr);

        for (int i = 0; i < maxLimit - 1; i++) {
            // initialize left and right
            int l = i + 1;
            int r = maxLimit - 1;
            int currElement = arr[i];
            while (l < r) {
                if (currElement + arr[l] + arr[r] == 0 && !(isVisited(i, l, r))) {
                    //if sum is 0, we found a pair
                    pairs++;
                    doVisit(i, l, r);
                    l++;
                    r--;
                    found = true;
                }
                // If sum of three elements is less
                // than zero then increment in left
                else if (currElement + arr[l] + arr[r] < 0)
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
            String currDir = System.getProperty("user.dir") + "/main/java/code/_4_student_effort/StudentPairOf3.txt";
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
