package code._4_student_effort.IteratorCurs;
import java.util.List;

public class ArrayCustomIteratorImpl implements ArrayCustomIterator {

    private List<Integer> lista;
    private int position;

    public ArrayCustomIteratorImpl(List<Integer> list){
        this.lista = list;
    }

    @Override
    public boolean hasNext() {
        return (position < lista.size() );
    }
    public Integer next() {
        return lista.get(position++);
    }

}
