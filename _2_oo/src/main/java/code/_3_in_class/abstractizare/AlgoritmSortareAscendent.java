package code._3_in_class.abstractizare;

public class AlgoritmSortareAscendent extends AlgoritmAbstract {

    boolean sortDirection(int[] arr, int i, int j){
        return arr[i] > arr[j];
    }
}
