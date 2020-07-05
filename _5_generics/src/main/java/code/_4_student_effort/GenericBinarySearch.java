package code._4_student_effort;

public class GenericBinarySearch {

    public static <T extends Comparable<T>> int bidirectionalBinarySearch (T[] arr, int left, int right, T x) {
        if (!checkSorted(arr)) {
            throw new ArrayNotSortedException("Array is not sorted ascending or descending");
        }
        return binarySearch(arr, left, right, x, getDirection(arr));
    }
    public static <T extends Comparable<T>> int binarySearch (T[] arr, int left, int right, T x, int direction) {
        if (right >= left) {
            int middle = (right + left) / 2;
            if (arr[middle].equals(x)) {
                return middle;
            }
            if (direction * arr[middle].compareTo(x) > 0) {
                return binarySearch(arr, left, middle - 1, x, direction);
            }
            return binarySearch(arr, middle + 1, right, x, direction);
        }
        return -1;
    }

    private static <T extends Comparable<T>> int getDirection(T[] arr) {
        return arr[0].compareTo(arr[1]) > 0 ? -1 : 1;
    }

    public static <T extends Comparable<T>> boolean checkSorted(T[] arr) {
        int direction = getDirection(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (direction * arr[i].compareTo(arr[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }
}
