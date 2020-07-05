package code._4_student_effort;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Occurrence {

    // read the data and put it in a map <word, appearances>
    private static Map<String, Integer> read(String filename) {
        Map<String, Integer> words = new HashMap<>();
        String word;
        String filepath = new File("").getAbsolutePath();

        try (Scanner s = new Scanner(new BufferedReader(new FileReader(filepath + filename)))) {
            while (s.hasNext()) {
                word = s.next();
                if (words.containsKey(word)) {
                    words.put(word, words.get(word) + 1);
                } else {
                    words.put(word, 1);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return words;
    }

    public static void main(String[] args) {
        String filename = "/_test_files/in/a.txt";
        Map<String, Integer> occ = read(filename);

        // sort the map and extract top ten entries by value
        Map<String, Integer> topTen = occ.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(10)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(topTen);


    }
}
