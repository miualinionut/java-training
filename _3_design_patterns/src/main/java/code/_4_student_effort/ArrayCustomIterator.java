package code._4_student_effort;

import java.util.Random;

public class ArrayCustomIterator implements MyIterator {
    int [] arr;
    int i = 0;
    public ArrayCustomIterator(int [] arr) {
        this.arr = arr;
    }

    @Override
    public boolean hasNext() {
        return arr.length > i;
    }

    @Override
    public int next() {
        return arr[i++];
    }

    public static void main(String[] args) {
        int [] arr = new int [100];
        Random rand = new Random();

        // generate some random numbers
        for (int j = 0; j < arr.length; j++) {
//            arr[j] = rand.nextInt(500);
            arr[j] = j;
        }

        ArrayCustomIterator i = new ArrayCustomIterator(arr);
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }

    }
}

