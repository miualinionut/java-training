package code._4_student_effort;

public class PairOf3 {
    public static void main(String[] args) {
        System.out.println(compute(new int[]{-1, -1, -1, 2}));
    }

    public static int compute(int[] array) {
        int counter =  0;
        int[] index = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for(int k = j + 1; k < array.length; k++) {
                    int first = array[i];
                    int second = array[j];
                    int third = array[k];
                    if (first + second + third == 0 && index[i] == 0 && index[j] == 0 && index[k] == 0) {
                        index[i] = 1;
                        index[j] = 1;
                        index[k] = 1;
                        counter++;
                    }
                }
            }
        }

        return counter;
    }
}
