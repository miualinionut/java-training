package code._4_student_effort._1_iterator;

class ArrayCustomIterator {
    private int[] arr;
    private int index;

    public ArrayCustomIterator(int[] arr){
        this.arr = arr;
        this.index = 0;
    }

    public boolean hasNext(){
        return this.index < arr.length;
    }

    public int next(){
        return this.arr[this.index++];
    }
}
