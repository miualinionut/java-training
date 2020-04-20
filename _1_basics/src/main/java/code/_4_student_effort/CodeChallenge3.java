package code._4_student_effort;

import java.util.Arrays;

public class CodeChallenge3 {
        public static void main(String[] args) {

            Challenge3(new int[]{2,-1,-2,-3});
        }
        public static void Challenge3(int[] anArray){
            int NumarPerechi = 0;
            Boolean[] booleanArray = new Boolean[anArray.length];
            Arrays.fill(booleanArray, Boolean.FALSE);
            //System.out.println(Arrays.toString(booleanArray));

            for(int i = 0; i < anArray.length; i++ ){
                    //System.out.println(anArray[i]);
                    for(int j = 0; j < anArray.length; j++){
                        if(anArray[i] + anArray[j] == 0 && i != j && !booleanArray[i] && !booleanArray[j]){
                            NumarPerechi +=1;
                            booleanArray[i] = true;
                            booleanArray[j] = true;
                        }
                    }
                }
            System.out.println(NumarPerechi);

        }
    }

