package code._3_in_class;

import java.lang.reflect.Type;
import java.util.*;
import java.util.function.Consumer;
//Iterator
/*
* - is used by enhanced for loop
* - can iterate forward only
* - remove only using the Iterator
* - no add/update allowed
* - FAIL FAST:
*       - arunca o exceptie atunci cand a indentificat o modificare pe colectia originala
*       - nu permit modificari peste original decat remove prin intermediul iterator
* - FAIL SAFE:
*       - fac o copie a colectiei inainte de a itera enhanced
*       - nu permit modificari peste copei
*       - permit modificatori peste original
*  */


// LIST ITERATOR MERGE DOAR PE LISTA SI POT SA FAC DE TOATE CU EL
public class CheckedList {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        List checkedList = Collections.checkedList(list,String.class);
//        list.add(5);
//        list.add(3.5);
//        list.add("hello");

        checkedList.add("5");
        checkedList.add("6");
        checkedList.add("7");
        checkedList.add("8");
        checkedList.add("9");
        checkedList.add("4");
        checkedList.add("3.5");
        checkedList.add("ssss");


//        ListIterator listIterator = list.listIterator();
//        listIterator.next();
//        listIterator.previous();
//        listIterator.set();

        //splitIterator
//        Spliterator spliteratorFirst = list.spliterator();
//        Spliterator spliteratorSecond = spliteratorFirst.trySplit();
//        System.out.println(spliteratorFirst.getExactSizeIfKnown());
//        System.out.println(spliteratorFirst.getExactSizeIfKnown());

        Spliterator<String> spliterator = list.spliterator();
        spliterator.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

//        displayClassicFor(list);
//        //displayEnhanchedFor(list);
//        displayUsingIterator(list);


    }

    private static void displayUsingIterator(List list) {
        System.out.println("++++++++++++++++");
        boolean removed = false;
        // tot enhanched for loop doar mai complicat // random acces
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String currentEllement = iterator.next();
            if(!removed){
                iterator.remove();
                removed = true;
            }
            System.out.println(currentEllement);
        }
    }

    private static void display(List list) {
        for(Object i : list){
            System.out.println(i);
        }
    }
    private static void displayClassicFor(List<String> list){
        boolean removed = false;
        LinkedList<String> linkedList = new LinkedList<>(list);
        for(int i = 0; i<list.size(); i++){
            if(!removed){
                list.remove(0);
                removed=true;
            }
            System.out.println(linkedList.get(i)); // acces secvential
        }
        System.out.println("==================");
    }

    private static void displayEnhanchedFor(List<String> list) {
        boolean removed = false;
        for(String s : list) {
            if(!removed){
                list.remove(1);//aici nu merge pentru ca isi pune la inceput cate valorin sunt in lista
            }
            System.out.println(s); //enhanced for loop // random acces
        }
    }
}
//for(;;) -> classic for loop