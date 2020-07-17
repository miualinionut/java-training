package code._2_challenge._7_my_hashtable;

public class MyHashTableChallenge {

  public static void main(String[] args) {
    MyHashTable<String, Integer> myHashTable = new MyHashTableImpl<>();
    myHashTable.put("key1", 20);
    myHashTable.put("key2", 40);
    myHashTable.put("key3", 102);
    System.out.println(myHashTable.size()); //should print 3

  }
}
