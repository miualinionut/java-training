package code._4_student_effort.GenericBinarySearch;

import java.util.Comparator;

public class GenericBinarySearch {

    public static <T extends Comparable> boolean genericBinarySearch(T[] arr, int left,int right, T value){
        if(isSorted(arr)) {
            while (left < right) {
                int half = left + (right - left) / 2;
                if (value.compareTo(arr[half]) == 0) return true;
                else if (value.compareTo(arr[half]) > 0) return genericBinarySearch(arr, half + 1, right, value);
                else if (value.compareTo(arr[half]) < 0) return genericBinarySearch(arr, left, half - 1, value);
            }
            return false;
        }
        return false;
    }

    public static <T extends Comparable> boolean isSortedAsc(T[] arr){
        int cnt = 0;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i].compareTo(arr[i+1]) < 0)
                cnt++;
        }
        if(cnt == arr.length -1) return true;
        return false;
    }

    public static <T extends Comparable> boolean isSortedDesc(T[] arr){
       int cnt = 0;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i].compareTo(arr[i+1]) > 0)
                cnt++;
        }
        if(cnt == arr.length -1) return true;
       return false;
    }

    public static <T extends Comparable> boolean isSorted(T[] arr){
        if(isSortedDesc(arr) == true || isSortedDesc(arr) == true) return true;
        if(isSortedDesc(arr) == false && isSortedDesc(arr) == false) {
            throw  new ArrayNotSortedException();
        }
        return false;
   }

    public static void main(String[] args) {

        Integer[] arr = new Integer[]{1,2,3,4};
        Float[] arr2 = new Float[]{3.1f,1.0f,5.5f,2.7f};


        System.out.println(isSortedAsc(arr) +" "+isSortedDesc(arr)+" "+ isSortedDesc(arr2) +" "+isSortedAsc(arr2));
        System.out.println(isSorted(arr));
        System.out.println(genericBinarySearch(arr,0, arr.length-1,3));
      //  System.out.println(genericBinarySearch(arr2,0, arr2.length,3.1f));

    }
}
