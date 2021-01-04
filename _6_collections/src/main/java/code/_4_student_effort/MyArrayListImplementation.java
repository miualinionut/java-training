package code._4_student_effort;

import java.util.Arrays;

public class MyArrayListImplementation<T> implements MyArrayList<T> {

    private Object[] list = new Object[0];

    public void add(T e){
        this.list = Arrays.copyOf(list,list.length+1);
        this.list[this.list.length-1] = e;
    }

    public void remove(T e){
        Object[] list2 = new Object[0];
        for (Object currentElement : this.list) {
            if (!currentElement.equals(e)) {
                list2 = Arrays.copyOf(list2, list2.length + 1);
                list2[list2.length - 1] = currentElement;
            }
        }
        this.list = list2;
    }


    public T get(int index){
        return (T) this.list[index];
    }

    public void set(int index, T e){
        this.list[index] = e;
    }

    public int size(){
        return this.list.length;
    }

    public static void main(String[] args) {
      MyArrayList<Integer> list = new MyArrayListImplementation<>();
        for(int i=0;i<20; i++) {
            list.add(i);
        }
        list.remove(15);
        list.set(0, 99);
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }
}
