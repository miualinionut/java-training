package code._4_student_effort;

public class code_3 {
    static int[] addX(int n, int arr[], int x) {
        int i;
        int newarr[] = new int[n + 1];
        for (i = 0; i < n; i++)
            newarr[i] = arr[i];
        newarr[n] = x;
        return newarr;
    }
    public static void main(String[] args){
        int[] v = new int[6];
        v[0]=1;
        v[1]=1;
        v[2]=0;
        v[3]=-1;
        v[4]=-1;
        v[5]=2;
        int n = 6, nr = 0;
        int[] arr = {};
        outerloop:
        for(int i=0; i<n-1; i++){
            for(int k=0; k<nr; k++){
                if(arr[k] == i){
                    continue outerloop;
                }
            }
            for(int j=i+1; j<n; j++){
                if(v[i]+v[j]==0){
                    arr = addX(nr, arr, j);
                    nr++;
                    continue outerloop;
                }
            }
        }
        System.out.println(nr);
    }
}
