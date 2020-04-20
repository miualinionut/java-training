package code._4_student_effort;

import java.util.Arrays;

import static java.util.Arrays.*;

public class CodeChallenge4 {

    public static void main(String[] args) {
        Challenge4(new int[]{-1, -1, 2, 3, -2});
    }
    public static void Challenge4(int[] anArray){

        int numarPerechi = 0;
        Boolean[] booleanArray = new Boolean[anArray.length];
        fill(booleanArray, Boolean.FALSE);
        for(int i = 0; i < anArray.length; i++) {
            for (int j = 0; j < anArray.length; j++) {
                for (int k = 0; k < anArray.length; k++) {
                        if (anArray[i] + anArray[j] + anArray[k] == 0 &&
                                i != j && i != k && j != k &&
                                !booleanArray[i] && !booleanArray[j] && !booleanArray[k]) {
                            booleanArray[i] = true;
                            booleanArray[k] = true;
                            booleanArray[j] = true;
                            numarPerechi += 1;

                        }
                }
            }

        }
            System.out.println(numarPerechi);

        }
    }


