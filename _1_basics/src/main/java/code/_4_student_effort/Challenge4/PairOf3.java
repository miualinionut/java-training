package code._4_student_effort.Challenge4;

public class PairOf3{

    static void findPairOf3(int[] arr, int n)
    {
       int p=0; //number of pairs
        for (int i=0; i<n-2; i++)
        {
            for (int j=i+1; j<n-1; j++)
            {
                for (int m=j+1; m<n; m++)
                {
                    if (arr[i]+arr[j]+arr[m] == 0)
                    {
                       p++;
                    }
                }
            }
        }
        System.out.println(p);

    }


    public static void main(String[] args)
    {
        int arr[] = {0, -1, 2, -3, 1};
        int n =arr.length;
        findPairOf3(arr, n);

    }
}
