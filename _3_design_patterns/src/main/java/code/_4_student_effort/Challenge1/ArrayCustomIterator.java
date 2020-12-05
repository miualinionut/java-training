package code._4_student_effort.Challenge1;

public class ArrayCustomIterator {
    int[] arr;
    int i = 0;

    private void ArrayCustomIterator(int[] arr) {
        this.arr = arr;
    }

    boolean hasNext() {
        if (i < arr.length)
            return true;
        else
            return false;
    }

    int next() {
        return arr[i];
    }


    public static void main (String[]args){
        int[] arr = new int[]{1, 2, 3};
        code._2_challenge._1_iterator.ArrayCustomIterator it = new code._2_challenge._1_iterator.ArrayCustomIterator(arr);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
