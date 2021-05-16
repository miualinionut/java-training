package code._4_student_effort;

import com.sun.nio.sctp.SctpSocketOption;

public class Main {

    public static void main(String[] args) {
        //TODO put your code changes in here
        int[] arr = new int[]{ 1,-1,1,-1 };
        int k=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == 0 && arr[j]!=1000){
                    //arr[i] = 1000;
                    arr[j] = 1000;
                    k++;
                    break;
                }
            }
        }
        System.out.println(k);


    }

}
