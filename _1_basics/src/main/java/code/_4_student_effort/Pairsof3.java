class Pairsof3
{
    static int countpairs(int arr[], int n)
    {
        int count = 0;
        Arrays.sort(arr);

        for (int i = 0; i < n - 1;i++)
        {
            if (arr[i] == arr[i + 1] == arr[i + 2])
            {
                count++;
                i = i + 3;
            }
            else
            {
                i++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        int arr[] = { 5, 4, 2, 3, 5, 2, 2, 3, 3 };
        int n = arr.length;

        System.out.println(countpairs(arr, n));
    }
}