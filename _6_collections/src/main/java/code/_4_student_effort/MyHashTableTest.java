package code._4_student_effort;

public class MyHashTableTest {
    public static void main(String[] args) {
        MyHashTable<String, String> t = new MyHashTableImpl<>();
        t.put("key1", "value1");
        t.put("key2", "value2");
        t.put("key3", "value3");

        System.out.println(t.size());

    }
}
