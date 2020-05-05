package code._4_student_effort.Challenge_1_Iterator;

public class Iterator {
    private int[] arr;
    private int index;

    public Iterator(int[] arr) {
        this.arr = arr;
        this.index = 0;
    }

    public boolean hasNext() {
        if (this.index < this.arr.length){
            return true;
        }
        return false;
    }

    public int next() {
        return this.arr[this.index++];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        Iterator it = new Iterator(arr);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }


}
