package code._4_student_effort.GenericLinkedList;

import java.util.ArrayList;
import java.util.List;

public class GenericList<T extends IGenericNode> implements IGenericList<T> {
    private List<T> lista = new ArrayList<>();

    @Override
    public void insert(T elem){
        lista.add(elem);
    }

    @Override
    public void println(){
        for(T item : lista){
            System.out.println(item);
        }
    }
    @Override
    public int getLength(){
        return lista.size();
    }
}
