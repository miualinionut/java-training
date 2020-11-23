package code._4_student_effort;

public class PairOf3 {
    public static void main(String[] args) {
        int[] numbers = {3, 6, 8, 9, 1, 2, 5, -3, -2, -6, -1, -1, -2, 1, 3, -2, 5, -3, -1, 2, -4, 7, 1};
        boolean[] usedNmbrs = new boolean[numbers.length];
        int pairs = 0;
        for (int i = 0; i < numbers.length - 2; i++) {
            for (int j = i + 1; j < numbers.length - 1; j++) {
                for (int k = j + 1; k < numbers.length; k++) {
                    if (!usedNmbrs[i] && !usedNmbrs[j] && !usedNmbrs[k]) {
                        if (numbers[i] + numbers[j] + numbers[k] == 0) {
                            System.out.println(numbers[i] + " + " + numbers[j] + " + " + numbers[k] + " = 0");
                            usedNmbrs[i] = true;
                            usedNmbrs[j] = true;
                            usedNmbrs[k] = true;
                            pairs++;
                        }
                    }
                }
            }
        }
        for(int nr: numbers)
        {
            System.out.print(nr + " ");
        }
        System.out.print("=> " + pairs);
    }
}
