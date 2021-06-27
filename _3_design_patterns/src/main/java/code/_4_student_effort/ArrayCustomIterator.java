package code._4_student_effort;

public class ArrayCustomIterator {
    int[] _arr;
    int _position;

    public ArrayCustomIterator(int[] arr){
        _arr=arr;
        _position=0;
    }

    boolean hasNext(){
        if(_position< _arr.length)
            return true;
        else
            return false;
    }

    int next(){
        return _arr[_position++];
    }
}
