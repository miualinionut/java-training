package code._4_student_effort.CodeChallange7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashTable<K, V> implements MyHashTable<K, V>{
    private int length = 0;
    private List<Object> elements = new ArrayList<>();

    public HashTable() {
        for(int i = 0; i < Integer.MAX_VALUE / 10; i++){
            this.elements.add(null);
        }
    }

    @Override
    public V get(K key) {
       return (V) this.elements.get(key.hashCode());
    }

    @Override
    public void put(K key, V value) {
        this.elements.set(key.hashCode(), value);
        length++;
    }

    @Override
    public void remove(K key) {
        this.elements.set(key.hashCode(), null);
        length--;
    }

    @Override
    public boolean containsKey(K key) {
        return this.elements.get(key.hashCode()) != null;
    }

    @Override
    public int size() {
        return length;
    }
}
