package code._4_student_effort;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Challenge3 {

    //append to the resulted string the first letter of every word in the list
    public static void Exercise1(List<String> list) {
        Function<List<String>, String> firstLetters = lista -> {
            StringBuilder result = new StringBuilder();
            for (String item : lista) {
                result.append(item.charAt(0));
            }
            return result.toString();
        };

        String ex1Result = firstLetters.apply(list);
        System.out.println(ex1Result);
    }

    public static void Exercise1Var2(List<String> list) {
        StringBuilder result = new StringBuilder();
        list.forEach(s -> result.append(s.charAt(0)));
        System.out.println(result.toString());

    }

    //remove the words with the length of s
    public static void Exercise2(List<String> list) {
        Predicate<String> lengthOdd = string -> (string.length() % 2 == 1);

//        Consumer<List<String>> consumer = lista -> {
//            for(int i = 0; i < lista.size(); i++){
//                if(lengthOdd.test(lista.get(i)))
//                    lista.remove(lista.get(i));
//            }
//        };
//        consumer.accept(list);

        list.removeIf(lengthOdd);
        System.out.println("Lista actualizata: ");
        list.forEach(item -> System.out.print(item + " "));
        System.out.println();
    }

    public static void Exercise3(List<String> list){
        UnaryOperator<String> toUpper = str -> str.toUpperCase();
        list.replaceAll(toUpper);
        System.out.println("Lista actualizata: ");
        list.forEach(item -> System.out.print(item + " "));
        System.out.println();
    }

    //STAGE 2:
    //convert every key-value pair of the map into a string, and append them in a single string
    public static void Exercise4(Map<String,Integer> map){
        StringBuilder result = new StringBuilder();
        Function<Map<String,Integer>, String> function = myMap ->{
            for(Map.Entry<String, Integer> entry : myMap.entrySet()){
                String aux = entry.getKey() + entry.getValue().toString();
                result.append(aux);
            }
            return result.toString();
        } ;

        System.out.println("Rezultatul este: ");
        System.out.println(function.apply(map));
    }

    public static void Exercise4Var2(Map<String,Integer> map) {
        StringBuilder result = new StringBuilder();
        map.forEach((k,v) -> result.append(k + v.toString()));

        System.out.println("Rezultatul este: ");
        System.out.println(result.toString());
    }

    //create a thread that prints the numbers from the list
    public static void Exercise5(List<Integer> list){
        Thread myThread = new Thread( () ->{
            for(Integer item : list) System.out.println(item);
        });
        myThread.start();

        //sau:
       // new Thread( () -> list.forEach(System.out::println) ).start();
    }

    public static void main(String[] args) {
        Exercise1(Arrays.asList("unu", "doi", "trei", "patru", "cinci"));
        Exercise1Var2(Arrays.asList("unu", "doi", "trei", "patru", "cinci"));
        Exercise2(new ArrayList<>(Arrays.asList("unu", "doi", "trei", "patru", "five")));
        Exercise3(Arrays.asList("unu", "doi", "trei", "patru", "cinci"));

        Map<String,Integer> numbers = new HashMap<>();
        numbers.put("unu",1);
        numbers.put("doi",2);
        numbers.put("trei",3);
        numbers.put("patru",4);
        Exercise4(numbers);
        Exercise4Var2(numbers);

        Exercise5(Arrays.asList(1,2,3,4,5,6));

    }
}
