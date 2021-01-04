package code._4_student_effort._5_generic_binary_search;

public class GenericBinSearch<T extends Comparable<T>> {
    T[] arr;
    int index;
    boolean sortedOrderAsc;

    public GenericBinSearch(T[] arr) {
        this.arr = arr;
        index = 0;
    }

    public boolean isArraySorted(){
        if(arr[0].compareTo(arr[1]) > 0){
            sortedOrderAsc = false; //descending
        }
        else if(arr[0].compareTo(arr[1]) < 0) {
            sortedOrderAsc = true; //ascending
        }

        for(int i = 1; i < arr.length - 1; i++){
            if(sortedOrderAsc & arr[i].compareTo(arr[i + 1]) > 0){
                return false;
            }
            if(!sortedOrderAsc & arr[i].compareTo(arr[i + 1]) < 0){
                return false;
            }
        }
        return true;
    }

    public int search(T x){
        if(!isArraySorted()) {
            throw new ArrayNotSortedException();
        }
        return binarySearch(0, arr.length - 1, x);
    }

    public void setNewArray(T[] arr){
        this.arr = arr;
    }

    private int binarySearch(int l, int r, T x){
        if(r >= l){
            int mid = l + (r - l)/2;
            if(arr[mid].equals(x)){
                return mid;
            }
            if(arr[mid].compareTo(x) > 0 ){
                if(sortedOrderAsc)
                    return binarySearch(l, mid - 1, x);
                else
                    return binarySearch(mid + 1, r, x);

            }
            if(arr[mid].compareTo(x) < 0 ){
                if(sortedOrderAsc)
                    return binarySearch(mid + 1, r, x);
                else
                    return binarySearch(l, mid - 1, x);
            }
        }
        return -1;
    }
}
