package code._4_student_effort;

import com.sun.nio.sctp.SctpSocketOption;

public class Main {

    public static void main(String[] args) {
        //TODO put your code changes in here
        int[] arr = new int[]{ -1,-1,2,-1 };
        int l=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k = j+1; k<arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0 && arr[j] != 1000 && arr[k] != 1000) {
                        arr[j] = 1000;
                        arr[k] = 1000;
                        l++;
                        break;
                    }
                }
            }
        }
        System.out.println(l);


    }

}
