package code._4_student_effort.GenericIterator;

import code._2_challenge._3_generic_linked_list.GenericList;
import code._2_challenge._3_generic_linked_list.IGenericList;

import java.util.ArrayList;
import java.util.List;

public class GenericIterator<T> implements IArrayIterator<T> {

    private List<T> lista = new ArrayList<>();
    private int position;

    public GenericIterator(T[] array){
        position=0;
        for(int i = 0; i < array.length; i++){
            lista.add(array[i]);
        }
    }
    public boolean hasNext(){
        return position < lista.size();
    }
    public T next(){
        return lista.get(position++);
    }
    public int length(){
        return lista.size();
    }
}
