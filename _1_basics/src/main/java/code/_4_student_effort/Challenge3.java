package code._4_student_effort;

public class Challenge3 {
    public static void main(String[] args) {
        int[] numbers = {3,2,-3,-2,3,0};
        int pairs = 0;
        boolean[] included = new boolean[numbers.length];
        for (int i = 0; i < numbers.length - 1; i++)
        {
            for (int j = i + 1; j < numbers.length; j++)
            {

                if (!included[i] && !included[j] && numbers[i] + numbers[j] == 0)
                {
                    included[i] = true;
                    included[j] = true;
                    pairs++;
                }
            }
        }
        System.out.println("[");
        for(int element: numbers) {
            System.out.print(element + ", ");
        }

        System.out.print("] => " + pairs);

    }
}



