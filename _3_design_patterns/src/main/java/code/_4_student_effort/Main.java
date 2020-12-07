package code._4_student_effort;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    //TODO put your code changes in here

    //Code challenge 1
    int[] arr = new int[] {1,2,3};
    ArrayCustomIterator it = new ArrayCustomIterator(arr);
    while (it.hasNext()) {
      System.out.println(it.next());
    }

    //Code challenge 2
    Integer[] arr1 = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
    Integer[] copy01OfArr = Arrays.copyOf(arr1, arr1.length);
    Integer[] copy02OfArr = Arrays.copyOf(arr1, arr1.length);

    BubbleSort bubble = new BubbleSort();
    MergeSort merge = new MergeSort();
    System.out.println("------BubbleSort------");
    bubble.displaySorted(bubble, copy01OfArr);
    System.out.println("------MergeSort------");
    merge.displaySorted(merge, copy02OfArr);
  }
}
