package code._4_student_effort;

import java.util.Arrays;

public class PairOf3 {
    public static Integer[] remove_element(Integer[] nums,int index){
        int i;
        for(i=index;i<nums.length - 1; ++i ){
            nums[i] = nums[i+1];
        }
        return nums;
    }
    public static int result(Integer[] nums,int n){
        // time: O(n^2)
        // memory: O(1)
        Arrays.sort(nums);
        int pairs = 0;
        for(int i = 0; i < n - 1; ++i){
            int j = i + 1;
            int k = n - 1;
            while(j < k){
                if(nums[i]+nums[j]+nums[k]==0){
                    ++pairs;
                    nums = remove_element(nums,i);
                    nums = remove_element(nums,j);
                    nums = remove_element(nums,k);
                    n = n - 3;
                    break;
                }
                else if(nums[i]+nums[j]+nums[k] < 0) ++j;
                else --k;
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        Integer[] nums = new Integer[]{-1, -1, -1, 2,0,0,0};
        System.out.println(result(nums,nums.length));
    }
}
