package code._4_student_effort;
import java.util.Scanner;

public class PairOf2 {
    public static void main(String args[]){

            int i, j, k, arrSize, nrOfPairs = 0;
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
                    indexesExist = false;
                    for(k = 0; k < nrOfPairs*2; k++){
                        if(i == accessedIndexes[k] || j == accessedIndexes[k])
                            indexesExist = true;
                    }
                    if (indexesExist == false && arr[i] + arr[j] == 0){
                        nrOfPairs++;
                        accessedIndexes[k+1] = i;
                        k++;
                        accessedIndexes[k+1] = j;
                    }
                }
            }
             System.out.println(nrOfPairs);
    }
}
