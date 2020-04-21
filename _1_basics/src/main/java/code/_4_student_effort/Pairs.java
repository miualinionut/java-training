public class Pairs {
    static int CountPairs(int arr[], int n)
    {
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((i + j) == (arr[i] + arr[j]))
                    count++;
            }
        }
        return count;
    }

    public static void main(String args[])
    {
        int arr[] = { 1, 0, 3, 2 };
        int n = arr.length ;
        System.out.print(CountPairs(arr, n));
    }
}