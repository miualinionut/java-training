package code._4_student_effort;

public class Challenge4 {
    public static void main(String[] args) {
        int[] numbers = {3, 6, 8, 9, 1, 2, 5, -3, -2, -6, -1, -1, -2, 1, 3, -2, 5, -3, -1, 2, -4, 7, 1};
        boolean[] usedNumbers = new boolean[numbers.length];
        int pairs = 0;
        for (int i = 0; i < numbers.length - 2; i++) {
            for (int j = i + 1; j < numbers.length - 1; j++) {
                for (int k = j + 1; k < numbers.length; k++) {
                    if (!usedNumbers[i] && !usedNumbers[j] && !usedNumbers[k]) {
                        if (numbers[i] + numbers[j] + numbers[k] == 0) {
                            System.out.println(numbers[i] + " + " + numbers[j] + " + " + numbers[k] + " = 0");
                            usedNumbers[i] = true;
                            usedNumbers[j] = true;
                            usedNumbers[k] = true;
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