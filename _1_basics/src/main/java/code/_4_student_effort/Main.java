package code._4_student_effort;

import java.security.PublicKey;

public class Main {

    int counter = 0;

    public int pairOf2(int[] ints) {
        for (int i = 0; i < ints.length-1; i++) {
            for (int j = 0; j < ints.length; j++) {
                if (ints[i] + ints[j] == 0 && ints[i] != ints[j]){
                    ints[i] = 0;
                    ints[j] = 0;
                    counter += 1;
                    break;
                }
            }
        }
        return counter;
    }



    public static void main(String[] args) {
        //TODO put your code changes in here
    Main main = new Main();
    int[] integers = new int[]{3,2,-3,-2,3,0};
        System.out.println(main.pairOf2(integers));

    }
}

