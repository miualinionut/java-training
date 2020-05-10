package code._4_student_effort.Iterator;

public class TestIterator {

    public static void main(String[] args) {

        int[] arr = new int[] {1,2,3};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
