package code._4_student_effort.Pair_of_3;

import code._4_student_effort.Pair_of_2.PairOfTwo;

public class Main {
    public static void main(String[] args) {
        Pair_of_Three myPairofThree = new Pair_of_Three();
        int nrOfPair = 0;
        int[] myArray = new int[8];
        myArray[0] = -1;
        myArray[1] = -1;
        myArray[2] = -1;
        myArray[3] = 2;
        myArray[4] = 5;
        myArray[5] = -10;
        myArray[6] = -2;
        myArray[7] = 2;

        nrOfPair = myPairofThree.pairOfThree(myArray);

        System.out.println("Number of pairs: " + nrOfPair + ';');

    }
}
