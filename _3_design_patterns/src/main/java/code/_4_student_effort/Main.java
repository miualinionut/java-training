package code._4_student_effort;

import java.util.Arrays;

public class Main {
  public static void displaySorted(SortingStrategy strategy, Integer[] arr)
  {
    strategy.sort(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    /*int[] arr=new int[] {1,2,3};
    ArrayCustomIterator it = new ArrayCustomIterator(arr);
    while (it.hasNext()){
      System.out.println(it.next());
    }*/
    Integer[] arr = new Integer[]{1,4,5,2,3,6,9,8,7};
    Integer[] copy010ofArr = Arrays.copyOf(arr,arr.length);
    Integer[] copy020ofArr = Arrays.copyOf(arr,arr.length);

    displaySorted(new BubleSort(),copy010ofArr);
    displaySorted(new MergeSort(),copy020ofArr);
  }
}
