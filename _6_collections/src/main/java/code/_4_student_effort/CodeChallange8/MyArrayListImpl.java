package code._4_student_effort.CodeChallange8;

import java.util.Arrays;

public class MyArrayListImpl<T> implements MyArrayList<T>{
    private Object[] list = new Object[0];

    @Override
    public void add(T e) {
        this.list = Arrays.copyOf(this.list, this.list.length + 1);
        this.list[this.list.length - 1] = e;
    }

    @Override
    public void remove(T e) {
        Object[] auxList = new Object[0];
        for(Object currElem : this.list){
            if(!currElem.equals(e)){
                auxList = Arrays.copyOf(auxList, auxList.length + 1);
                auxList[auxList.length - 1] = currElem;
            }
        }
        this.list = auxList;
    }

    @Override
    public T get(int index) {
        return (T) this.list[index];
    }

    @Override
    public void set(int index, T e) {
        this.list[index] = e;
    }

    @Override
    public int size() {
        return this.list.length;
    }
}
