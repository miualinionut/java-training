public class MergeSort implements SortingStrategy {
    @Override
    public void sort(Integer[] arr) {

        int l = 0;
        int r = arr.length-1;
        int m = l+(r-l)/2;
        int n1 = m-l+1;
        int n2 = r-m;


        // create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        //initial index
        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        //copy remaining elements of L[]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        //copy remaining elements of R[]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        
        int n = arr.length;
        System.out.println("Merge Sort");
        for (int p = 0; p < n; ++p)
            System.out.print(arr[p] + " ");
        System.out.println();
        
    }
}
