package code._3_in_class;

import java.sql.SQLOutput;
import java.util.*;

public class CheckedList {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        List<String> checkedList = Collections.checkedList(list, String.class);
        checkedList.add(1);
        checkedList.add(2);
        checkedList.add(3);
        checkedList.add(4);
        checkedList.add(5);
        checkedList.add(5);
        checkedList.add(3.14);
        checkedList.add("hello");

        dsplay(list);
        System.out.println("-------------");
        //displayUsingIterator(list);
        displayEnhancedFor(list);
    }

    private static void displayUsingIterator(List list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String currentElement = iterator.next();
            System.out.println(currentElement);
        }

    }

    private static void dsplay(List<String> list) {
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            if(i==5) list.remove(5);
            System.out.println(linkedList.get(i));
        }
    }

    private static void displayEnhancedFor(List<String> list) {
        for (String s : list) {
            if(s.equals("5")) list.remove(5);
            System.out.println(s); //enhanced for Loop
        }
    }
}
