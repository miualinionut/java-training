package code._4_student_effort.Pair_of_2;

import code._4_student_effort.FooBarQix.FooBarQix;

public class Main {
    public static void main(String[] args) {
        PairOfTwo myPairOfTwo = new PairOfTwo();
        int nrOfPair = 0;
        int[] myArray = new int[6];
        myArray[0] = 5;
        myArray[1] = 9;
        myArray[2] = -5;
        myArray[3] = 7;
        myArray[4] = -5;
        myArray[5] = 1;

        nrOfPair = myPairOfTwo.pairOfTwo(myArray);

        System.out.println("Number of pairs: " + nrOfPair + ';');

    }
}
