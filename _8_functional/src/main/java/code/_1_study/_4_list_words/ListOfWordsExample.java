package code._1_study._4_list_words;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfWordsExample {
    public static void main(String[] args) {
        List<String> words =  new ArrayList<>(Arrays.asList("hello", "java", "yay", "cat"));
        String longWord = words.stream()
                .filter(w -> w.length() < 4)
                .map(String::toUpperCase)
                .distinct()
                .reduce("", String::concat); // terminal operation
        System.out.println(longWord);
    }
}
