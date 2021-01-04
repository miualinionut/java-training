package code._4_student_effort;

import code._2_challenge._9_my_set.MySetImpl;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MySetImplementation<T> implements MySet<T> {
    private Object[] list = new Object[0];

    public void add(T e){
        if(!contains(e)) {
            this.list = Arrays.copyOf(list, list.length + 1);
            this.list[this.list.length - 1] = e;
        }
    }


   public void remove(T e){
       Object[] newList = new Object[0];
       for (Object currentElement : this.list) {
           if (!currentElement.equals(e)) {
               newList = Arrays.copyOf(newList, newList.length + 1);
               newList[newList.length - 1] = currentElement;
           }
       }
       this.list = newList;

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


    public boolean contains(T e){
        boolean ok = false;
        for (Object o : this.list) {
            ok = o == e;
        }
        return ok;
    }

    public static void main(String[] args) {
        Collection<Integer> list = List.of(1, 1, 2, 1, 3, 2);
        MySet<Integer> mySet = new MySetImplementation<>();
        for(Integer i: list) {
            mySet.add(i);
        }
        for(int i=0;i<mySet.size();i++) {
            System.out.println(mySet.get(i));
        }
    }
}
