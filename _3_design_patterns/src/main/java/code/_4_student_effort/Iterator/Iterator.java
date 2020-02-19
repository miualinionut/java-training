package code._4_student_effort.Iterator;

public class Iterator {

    public static class ArrayCustomIterator{

        private int[] arr;
        private int curent;

        public ArrayCustomIterator(int arr[]) {
            this.arr = arr;
            curent = 0;
        }

        public boolean hasNext(){
            return this.curent< this.arr.length;
        }
        public int next() {
            return this.arr[this.curent++];
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

}
