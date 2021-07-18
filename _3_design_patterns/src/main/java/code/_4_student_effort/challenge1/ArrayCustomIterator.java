package code._4_student_effort.challenge1;

public class ArrayCustomIterator {

    private int[] array;
    private int curr;

    public ArrayCustomIterator(int[] array) {
        this.array = array;
        this.curr = 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public boolean hasNext(){
        if(this.curr < this.array.length)
            return true;
        return false;
    }

    public int next() {
        return this.array[this.curr + 1];
    }
}
