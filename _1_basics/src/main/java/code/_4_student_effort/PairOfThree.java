package code._4_student_effort;
import java.util.Arrays;
import java.io.*;
public class PairOfThree {
    static int PairOf3(int[] arr) {
        boolean[] found = new boolean[arr.length];
        Arrays.sort(arr);
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n - 2; i++)
        {
            int l = i + 1;
            int r = n - 1;
            int x = arr[i];
            while (l < r){
                if(x + arr[l]+arr[r]==0 ){
                    count = count + 1;
                    l++;
                    r--;
                    found[l] = found[r]= found[i]=true;
                }
                else if(x + arr[l]+arr[r] < 0)
                    l++;
                else
                    r--;

            }
        }
        return count;
    }
    public static void main(String[] args) {

        //int arr[] =   {1,1,0,-1,-1,1};
        // int arr[] = {1,-1,-1,2};
        int arr[] = {0,-1,1,2,-3};
        //int n = arr.length;
      //System.out.println(PairOfTwo.findPair(arr));
        System.out.println(PairOfThree.PairOf3(arr));

    }}