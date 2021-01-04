package code._4_student_effort._7_hash_table;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashTable<K, V> implements MyHashTable<K, V> {

    private final List<List<HashTableNode<K, V>>> table = new ArrayList<>();
    private int size;
    private final int tableMaxSize = 111;
    public HashTable() {
        size = 0;
        for(int i = 0; i < tableMaxSize; i++) //Create an initial empty array of a large prime number
            table.add(new LinkedList<>());
    }

    @Override
    public V get(K key) {
        if(containsKey(key))
            return table.get(getHash(key)).get(0).Value;
        else return null;
    }

    @Override
    public void put(K key, V value) {
        HashTableNode<K, V> toAdd = new HashTableNode<>(key, value);
        table.get(getHash(key)).add(toAdd);
        size++;
    }

    @Override
    public void remove(K key) {
        size -= table.get(getHash(key)).size();
        table.remove(getHash(key));
    }

    @Override
    public boolean containsKey(K key) {
        return !table.get(getHash(key)).isEmpty();
    }

    @Override
    public int size() {
        return size;
    }

    private int getHash(K key){
        return key.hashCode() % tableMaxSize;
    }
}
