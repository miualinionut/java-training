package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MyHashTableImpl<K, V> implements MyHashTable<K, V> {

//    private final List<V> arrTable = new ArrayList<>(Integer.MAX_VALUE);
    private Object[] arrTable;// = new V[Integer.MAX_VALUE];
    private int size;

    public MyHashTableImpl() {
        arrTable = new Object[Integer.MAX_VALUE/100];
    }

    @Override
    public V get(K key) {
//        return arrTable.get(key.hashCode());
        return (V) arrTable[key.hashCode()];
    }

    @Override
    public void put(K key, V value) {
//        arrTable.add(key.hashCode(), value);
        arrTable[key.hashCode()] = value;
        size++;
    }

    @Override
    public void remove(K key) {
//        arrTable.remove(key.hashCode());
        arrTable[key.hashCode()] = null;
        size--;
    }

    @Override
    public boolean containsKEy(K key) {
//        return arrTable.get(key.hashCode()) != null;
        return arrTable[key.hashCode()] != null;
    }

    @Override
    public int size() {
        return size;
    }


}
