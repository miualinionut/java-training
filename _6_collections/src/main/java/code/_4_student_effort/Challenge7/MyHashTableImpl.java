package code._4_student_effort.Challenge7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyHashTableImpl implements MyHashTable {

    private List<List<String>> values = new ArrayList<>();
    private List<String> keys = new ArrayList<>();

    @Override
    public String get(String key) {
        int index = keys.indexOf(key);
        if(index == -1) return null;
        else return values.get(index).get(0); //daca sunt mai multe valori asociate cheii primite, o returnam doar pe prima
        //daca e doar o valoare asociata cheii, o returnam
    }

    @Override
    public void put(String key, String value) {
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
    public void remove(String key) {
        int index = keys.indexOf(key);
        if(index == -1) System.out.println("Nu am scos nimic, pentru ca respectiva cheie nici nu exista in hashTable");
        else {
            values.remove(index);
            keys.remove(index);
        }
    }

    @Override
    public boolean constainsKey(String key) {
        int index = keys.indexOf(key);
        if(index == -1) return false;
        else return true;
    }

    @Override
    public int size() {
        return keys.size();
    }
}
