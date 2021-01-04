package code._4_student_effort;

public class HashTable<K,V> implements MyHashTable<K,V> {
    private final Object[] value = new Object[Integer.MAX_VALUE/100];
    private int n = 0;

    @Override
    public V get(K key){
        return (V) this.value[key.hashCode()];
    }

    public void put(K key, V value){
        this.value[key.hashCode()] = value;
        n = n+1;
    }

    public void remove(K key){
        this.value[key.hashCode()] = null;
    }

    public boolean containsKey(K key){
        return this.value[key.hashCode()] != null;
    }

    public int size(){
        return n;
    }

    public static void main(String[] args) {
        MyHashTable<String, String> myHashTable = new HashTable<>();
        myHashTable.put("key1", "value1");
        myHashTable.put("key2", "value2");
        myHashTable.put("key3", "value3");
        myHashTable.remove("key1");
        System.out.println(myHashTable.size());

    }
}
