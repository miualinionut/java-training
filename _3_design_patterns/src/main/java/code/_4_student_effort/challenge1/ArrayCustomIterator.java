package code._4_student_effort.challenge1;

public class ArrayCustomIterator{
    int array[];
    int index;
    ArrayCustomIterator(int a[]){
        array=a;
        index=0;
    }
    boolean hasNext(){
        if(index<array.length){
            return true;
        }
        else{
            return false;
        }
    }

    int next(){
        return array[index++];
    }



    public static void main(String[] args) {
        int a[]= new int[]{1,2,3,4,5};
        ArrayCustomIterator i= new ArrayCustomIterator(a);
        while(i.hasNext()){
            System.out.println(i.next());

        }
    }


}
