package code._4_student_effort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PairOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int numbers[] = new int[length];
        int i,j,k,numberofpairs=0;
        for(i=0;i<length;i++){
            numbers[i]=sc.nextInt();
        }

        for(i=0;i<length-1;i++) {
            for (j = i + 1; j < length; j++) {
                if (numbers[i] + numbers[j] == 0) {
                    numberofpairs++;
                    for (k = j; k < length - 1; k++) {
                        numbers[k] = numbers[k + 1];
                    }
                    length--;
                    break;
                }
            }
            for(k=i;k<length-1;k++){
                numbers[k]=numbers[k+1];
            }
            length--;
            i--;
        }
        System.out.println(numberofpairs);
    }
}
