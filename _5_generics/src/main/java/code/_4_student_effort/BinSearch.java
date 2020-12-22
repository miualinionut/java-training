package code._4_student_effort;

import code._2_challenge._5_generic_binary_search.ArrayNotSortedException;

public class BinSearch {

    static <T extends  Comparable> int   binarySearch(T[] arr, int l, int r, T searchElem, boolean sortDir){
        int mid;
        if(r >= 1){
            mid = l + (r-1)/2;
            if (arr[mid].equals(searchElem)) {
                return mid;
            }
            if(arr[mid].compareTo(searchElem) > 0) {
                return binarySearch(arr, l, mid - 1, searchElem, sortDir);
            }
            return binarySearch(arr, mid+1, r, searchElem, sortDir);
        }
        return -1;
    }

    static <T extends Comparable> boolean findSortDir(T[] arr) throws ArrayNotSortedException {
        int i;
        if (arr[0].compareTo(arr[arr.length-1]) < 0 ) {
            for (i = 0; i < arr.length-1; i++) {
                if (arr[i].compareTo(arr[i+1]) > 0)
                    throw new ArrayNotSortedException("Array is not sorted");
            }
            return true;
        }
        else{
            for (i = 0; i < arr.length-1; i++) {
                if (arr[i].compareTo(arr[i+1]) < 0)
                    throw new ArrayNotSortedException("Array is not sorted");
            }
            return false;

        }
    }

    public static void main(String[] args) throws ArrayNotSortedException {
        Integer[] intArr = new Integer[] {1, 2, 3 , 4, 5};
        Character[] charArr = new Character[] {'a', 'b', 'z', 'd', 'x'};
        boolean aux;
        aux = findSortDir(intArr);
        System.out.println(binarySearch(intArr, 0, intArr.length, 3, aux));
        aux = findSortDir(charArr);
        System.out.println(binarySearch(charArr, 0, charArr.length, 'b', aux));



    }
    
}
