package code._4_student_effort;

public class PascalTriangleChallenge {

    public static void main(String[] args){
        printPascalTriangle(10);
    }


    static void printPascalTriangle(int n)
    {

        for (int line = 0; line < n; line++)
        {
            for (int i = 0; i <= line; i++)
                System.out.print(coeficient(line, i)+" ");
            System.out.println();
        }
    }


    static int coeficient(int n, int k)
    {
        int res = 1;
        if (k > n - k)
            k = n - k;
        for (int i = 0; i < k; ++i)
        {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }
}
