package code._4_student_effort._8_array_list;

public class ArrList<T> implements MyArrayList<T>{
    private Object[] Array;

    public ArrList() {

        Array = new Object[0];
    }

    @Override
    public void add(T e) {
        Object[] intermittentArray = new Object[Array.length + 1];
        System.arraycopy(Array, 0, intermittentArray, 0, Array.length);
        intermittentArray[Array.length] = e;
        Array = intermittentArray;
    }

    @Override
    public void remove(T e) {
        int position = find(e);
        Object[] intermittentArray = new Object[Array.length - 1];
        System.arraycopy(Array, 0, intermittentArray, 0, position);
        System.arraycopy(Array, position + 1, intermittentArray, position, Array.length - position - 1);
        Array = intermittentArray;
    }

    private int find(T e){
        for(int i = 0; i < Array.length; i++){
            if(e.equals(Array[i])){
                return i;
            }
        }
        return -1;
    }
    @Override
    public T get(int index) {
        return (T) Array[index];
    }

    @Override
    public void set(int index, T e) {
        Array[index] = e;
    }

    @Override
    public int size() {
        return Array.length;
    }
}
