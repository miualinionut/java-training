package code._4_student_effort.challenge7;

public class MyHashTableClass<K,V> implements MyHashTable<K,V>{

    private int size=0;
    private Object[] val=new Object[Integer.MAX_VALUE/10];  //removing the 10 will result in an error message.

    @Override
    public V get(K key) {
        return (V) this.val[key.hashCode()];
    }

    @Override
    public void put(K key, V value) {
        this.size++;
        this.val[key.hashCode()]=value;

    }

    @Override
    public void remove(K key) {
        this.val[key.hashCode()]=null;
        this.size--;

    }

    @Override
    public boolean containsKey(K key) {
        if(this.val[key.hashCode()]!=null) return true;
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }
}
