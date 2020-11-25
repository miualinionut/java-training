package code._4_student_effort;

import java.util.Scanner;

public class PairOf3 {
    public static void main(String args[]){

        int i, j, k, l,  arrSize, nrOfPairs = 0;
        boolean indexesExist;

        Scanner in = new Scanner(System.in);
        System.out.println("Input array size:");
        arrSize = in.nextInt();
        int[] arr = new int[arrSize];
        int[] accessedIndexes = new int[arr.length];
        System.out.println("Input array:");
        for(i = 0; i < arrSize; i++){
            arr[i] = in.nextInt();
        }

        for(i = 0; i < arrSize-1; i++){
            for(j = i+1; j < arrSize; j++){
                for(k = j+1; k < arrSize; k++) {
                    indexesExist = false;
                    for (l = 0; l < nrOfPairs * 3; l++) {
                        if (i == accessedIndexes[l] || j == accessedIndexes[l] || k == accessedIndexes[l])
                            indexesExist = true;
                    }
                    if (indexesExist == false && arr[i] + arr[j] + arr[k] == 0) {
                        nrOfPairs++;
                        accessedIndexes[l + 1] = i;
                        l++;
                        accessedIndexes[l + 1] = j;
                        l++;
                        accessedIndexes[l + 1] = k;
                    }
                }
            }
        }
        System.out.println(nrOfPairs);
    }
}
