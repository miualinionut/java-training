package code._4_student_effort.Challenge7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyGenericHashTableImpl <K,V> implements MyGenericHashTable <K,V> {

    private List<List<V>> values = new ArrayList<>();
    private List<K> keys = new ArrayList<>();

    @Override
    public V get(K key) {
        int index = keys.indexOf(key);
        if(index == -1) return null;
        else return values.get(index).get(0);
    }

    @Override
    public void put(K key, V value) {
        int index = keys.indexOf(key);
        if(index == -1){
            keys.add(key);
            values.add(new ArrayList<>(Arrays.asList(value)));
        }
        else{
            values.get(index).add(value);
        }
    }

    @Override
    public void remove(K key) {
        int index = keys.indexOf(key);
        if(index == -1) System.out.println("Nu am scos nimic, pentru ca respectiva cheie nici nu exista in hashTable");
        else {
            values.remove(index);
            keys.remove(index);
        }
    }

    @Override
    public boolean constainsKey(K key) {
        int index = keys.indexOf(key);
        if(index == -1) return false;
        else return true;
    }

    @Override
    public int size() {
        return keys.size();
    }
}
