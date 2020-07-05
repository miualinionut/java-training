package code._4_student_effort;

public class BinarySearchTest {

    public static void main(String[] args) {
        Integer[] arr1 = new Integer[10];
        Integer[] arr2 = new Integer[10];
        int j = 10;
        for (int i = 1; i <= 10; i++) {
            arr1[i - 1] = i;
            arr2[i - 1] = j;
            j--;
        }

        System.out.println("Array is sorted ascending. 3 is on index: " +
                GenericBinarySearch.bidirectionalBinarySearch(arr1, 0, arr1.length, 3));
        System.out.println("Array is sorted descending. 3 is on index: " +
                GenericBinarySearch.bidirectionalBinarySearch(arr2, 0, arr2.length, 3));

        // array 2 is not sorted => exception
        arr2[5] = 100;
        System.out.println(GenericBinarySearch.bidirectionalBinarySearch(arr2, 0, arr2.length, 3));

    }
}
