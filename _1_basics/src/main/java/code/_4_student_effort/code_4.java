package code._4_student_effort;

public class code_4 {
    static int[] addX(int n, int arr[], int x) {
        int i;
        int newarr[] = new int[n + 1];
        for (i = 0; i < n; i++)
            newarr[i] = arr[i];
        newarr[n] = x;
        return newarr;
    }
    public static void main(String[] args){
        int[] v = new int[4];
        v[0]=-1;
        v[1]=-1;
        v[2]=-1;
        v[3]=2;
        int n = 4, nr = 0;
        int[] arr = {};
        outerloop:
        for(int i=0; i<n-2; i++) {
            for (int k = 0; k < nr; k++) {
                if (arr[k] == i) {
                    continue outerloop;
                }
            }
            for (int j = i + 1; j < n - 1; j++) {
                for (int x = i + 2; x < n; x++) {
                    if (v[i] + v[j] + v[x] == 0) {
                        arr = addX(nr, arr, j);
                        nr++;
                        arr = addX(nr, arr, x);
                        nr++;
                        continue outerloop;
                    }
                }
            }
        }
        System.out.println(nr/2);
    }
}
