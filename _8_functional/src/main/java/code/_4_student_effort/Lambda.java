package code._4_student_effort;

import java.util.*;

public class Lambda {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Lambda","code","challenge"));
        createString(list);
        removeWords(list);
        upperCase(list);
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3, "three");
        keyValue(map);
        printThread(list);

    }
    public static void createString(List<String> list){
        StringBuilder str = new StringBuilder();
        list.forEach(s->str.append(s.charAt(0)));
        System.out.print(str);
    }

    public static void removeWords(List<String> list){
        list.removeIf(str -> str.length()%2==1);
        list.forEach(System.out::println);
    }

    public static void upperCase(List<String> list){
        list.replaceAll(s->s.toUpperCase());
        list.forEach(System.out::println);
    }

    public static void keyValue(Map<Integer, String> map){
        StringBuilder mapAsString = new StringBuilder();
        map.forEach((key,value)->  mapAsString.append(key+value));
        System.out.println(mapAsString);
    }

    public static void printThread(List<String> list){
        new Thread(()->list.forEach(System.out::println)).start();
    }
}
