package code._4_student_effort;

public class PairOf2 {
    public static void main(String[] args) {
        System.out.println(compute(new int[]{3, 2, -3, -2, 3, 0}));
        System.out.println(compute(new int[]{1, 1, 0, -1, -1}));
        System.out.println(compute(new int[]{5, 9, -5, 7, -5}));
    }

    public static int compute(int[] array) {
        int counter =  0;
        int[] index = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int first = array[i];
                int second = array[j];
                if (first + second == 0 && index[i] == 0 && index[j] == 0) {
                    index[i] = 1;
                    index[j] = 1;
                    counter++;
                }
            }
        }

        return counter;
    }
}
