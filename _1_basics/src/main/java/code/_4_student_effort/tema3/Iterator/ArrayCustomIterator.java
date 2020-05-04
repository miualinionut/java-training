package code._4_student_effort.tema3.Iterator;
import java.util.ArrayList;
import java.util.List;

public class ArrayCustomIterator implements IteratorInterface {

    private List<Integer> lista = new ArrayList<>();
    private int position;

    public ArrayCustomIterator(int []list){
        for(int i = 0; i<list.length; i++)
            lista.add(list[i]);
    }

    @Override
    public boolean hasNext() {
        return (position < lista.size());
    }

    @Override
    public int next() {
        return lista.get(position++);
    }
}
