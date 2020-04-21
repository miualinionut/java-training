package code._4_student_effort._3_pair2;

public class PairOfTwo {
    public static void main(String[] args){
        int[] arr1 = new int[]{5, 9, -5, 7, 5};
        int[] arr2 = new int[]{3, 2, -3, -2, 3, 0};
        int[] arr3 = new int[]{1, 1, 0, -1, -1};
        Integer count1  = GetCount.getNumber(arr1);
        System.out.println(count1); //1

        Integer count2  = GetCount.getNumber(arr2);
        System.out.println(count2); //2

        Integer count3  = GetCount.getNumber(arr2);
        System.out.println(count3); //2
    }
}
