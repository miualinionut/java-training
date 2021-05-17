package code._4_student_effort;

public class Challange4 {
    public static void main(String[] args) {
        int[] numbers = {-1,-1,-1,2};
        int pairs = 0;
        boolean[] included = new boolean[numbers.length];
        for (int i = 0; i < numbers.length - 2; i++)
        {
            for (int j = i + 1; j < numbers.length-1; j++) {
                for (int k = j + 1; j < numbers.length; k++)

                    if (!included[i] && !included[j] && !included[k]) {
                        if (numbers[i] + numbers[j] + numbers[k] == 0) {
                            System.out.println(numbers[i] + " + " + numbers[j] + " + " + numbers[k] + " = 0");
                            {
                                included[i] = true;
                                included[j] = true;
                                included[k] = true;
                                pairs++;
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
