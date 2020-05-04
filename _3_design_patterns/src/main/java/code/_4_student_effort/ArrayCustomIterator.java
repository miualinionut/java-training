package code._4_student_effort;

public class ArrayCustomIterator {
    private int[] arr;
    private static int nr;
    ArrayCustomIterator(int[] a){
        nr=0;
        arr=a;
    }
    boolean hasNext(){
        if(arr.length<=nr)return false;
        return true;
    }
    int next(){
       return arr[nr++];
    }

}
