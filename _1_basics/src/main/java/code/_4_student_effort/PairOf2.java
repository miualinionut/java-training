package code._4_student_effort;

public class PairOf2 {
    public static void main(String[] args)
    {
        int[] numbers = {1, 1, 0, -1, -1};

        boolean[] isUsed = new boolean[numbers.length];
        int nOfPairs = 0;
        for(int i = 0; i < numbers.length - 1; i++)
        {
            for(int j = i + 1; j < numbers.length; j++)
            {

                if(!isUsed[i] && !isUsed[j] && numbers[i] + numbers[j] == 0)
                {
                    isUsed[i] = true;
                    isUsed[j] = true;
                    nOfPairs++;
                }
            }
        }
        System.out.print("[");
        for(int element: numbers) {
            System.out.print(element + ", ");
        }

        System.out.print("] => " + nOfPairs);

    }
}
