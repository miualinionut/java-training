package code._4_student_effort.challenge7;


public class Challenge7Main {

        public static void main(String[] args) {
            MyHashTable<String, String> myHashTable = new MyHashTableClass<>();
            myHashTable.put("key1", "value1");
            myHashTable.put("key2", "value2");
            myHashTable.put("key3", "value3");
            System.out.println(myHashTable.size());

        }

}
