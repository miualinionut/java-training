package code._4_student_effort.challenge1;

public class ArrayCustomIterator {

    int[] arr;
    ArrayCustomIterator(){};

    ArrayCustomIterator(int[] arr){
        this.arr = arr;
    };

    boolean hasNext(){
        if(arr.length > 0){
            return true;
        }else return false;
    };

    int next(){
        int primaValoare = arr[0];
        int[] newArray = new int[arr.length - 1];
        for(int i=1; i <= arr.length - 1; i++){
            newArray[i-1] = arr[i];
        }
        arr = newArray;
        return primaValoare;
    };

}
