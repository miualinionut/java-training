package code._4_student_effort.CodeChallange1;

public class ArrayCustomIterator {
    private int[] array;
    private int index;

    public ArrayCustomIterator(int[] array){
        this.array = array;
        this.index = 0;
    }

    public boolean hasNext(){
        return (this.index < this.array.length);
    }

    public int next(){
        return this.array[this.index++];
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
