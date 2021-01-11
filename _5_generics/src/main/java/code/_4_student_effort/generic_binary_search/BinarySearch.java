package code._4_student_effort.generic_binary_search;

public class BinarySearch {

    public <T extends Comparable> void binarySearch(T[] arr, int searchedNumber) {
        int index;
        if (ascendingOrder(arr)) {
            index = binarySearch(arr, 0, arr.length - 1, searchedNumber, 1);
        } else if (descendingOrder(arr)) {
            index = binarySearch(arr, 0, arr.length - 1, searchedNumber, -1);
        } else {
            throw new ArrayNotSortedException("The array isn't sorted!");
        }

        if (index == -1) {
            System.out.println("The number wasn't found");
        } else {
            System.out.println("Index: " + index);
        }
    }

    public <T extends Comparable> boolean ascendingOrder(T[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(arr[i - 1]) < 0) {
                return false;
            }
        }
        return true;
    }

    public <T extends Comparable> boolean descendingOrder(T[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(arr[i - 1]) > 0) {
                return false;
            }
        }
        return true;
    }

    public <T extends Comparable> int binarySearch(T[] arr, int left, int right, int searchedNumber, int direction) {
        if (right >= left) {
            int middle = left + (right - left) / 2;

            if (arr[middle].equals(searchedNumber)) {
                return middle;
            }
            if (arr[middle].compareTo(searchedNumber) == direction) {
                return binarySearch(arr, left, middle - 1, searchedNumber, direction);
            }
            return binarySearch(arr, middle + 1, right, searchedNumber, direction);

        }

        return -1;
    }

    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        Integer[] list01 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer[] list02 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Integer[] list03 = {2, 3, 2, 6, 7};

        obj.binarySearch(list02, 4);
        obj.binarySearch(list01, -2);
        obj.binarySearch(list03, 2);
    }
}
