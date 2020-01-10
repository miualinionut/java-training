package code._3_in_class;

import java.util.*;

public class CheckedList {

    public static void main(String[] args) {
        List list = new ArrayList<>();
        List checkedlist = Collections.checkedList(list,String.class);
        checkedlist.add("1");
        checkedlist.add("2");
        checkedlist.add("3");
        checkedlist.add("4");
        checkedlist.add("5");
        checkedlist.add("3.14");
        checkedlist.add("hello");

        display(list);
        displayIterator(list);
        displayEnhancedFor(list);
    }

    private static void displayEnhancedFor(List<String> list) {
        for(String s: list){
            if(s.equals(2)){
                list.remove(2);
            }
            System.out.println(s);
        }
    }

    private static void displayIterator(List list) {
        Iterator<String> iterator = list.iterator();
        boolean removed = false;
        while(iterator.hasNext()){
            String currentElement = iterator.next();
            if(!removed) {
                iterator.remove();
                removed = true;
            }
            System.out.println(currentElement);
        }
    }

    private static void display(List<String> list) {
        LinkedList<String> linkedList = new LinkedList<>();

        for(int i = 0; i < list.size(); i++){
            if(i == 5){
                list.remove(5);
            }
            System.out.println(linkedList.get(i));;
        }

    }
}
