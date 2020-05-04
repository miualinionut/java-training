package code._4_student_effort.challenge1;

public class ArrayCustomIterator {

    int[] array;
    int index;

    public ArrayCustomIterator(int[] array){
        this.array=array;
        this.index=0;
    }

    public boolean hasNext(){
        if(this.index<this.array.length){
            return true;
        }
        return false;
    }

    int next(){
        this.index++;
        return this.array[this.index-1];

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
       ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
