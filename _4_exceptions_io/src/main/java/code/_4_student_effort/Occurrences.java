package code._4_student_effort;

import java.io.*;
import java.util.*;

public class Occurrences {

    public static void main(String[] args) {
        // Read the text
        Scanner scanner;
        BufferedWriter writer;
        String fileInputPath = "_4_exceptions_io/_test_files/in/a.txt";
        String fileOutputPath = "_4_exceptions_io/_test_files/out/student_Occurrences.txt";
        Map<String, Integer> wordOccurrence = new HashMap<>();
        try {
            scanner = new Scanner(new BufferedReader(new FileReader(fileInputPath)));
            // Create map
            String currentWord;
            while (scanner.hasNext()) {
                currentWord = scanner.next();
                if (null == wordOccurrence.get(currentWord)) {
                    wordOccurrence.put(currentWord, 1);
                } else {
                    wordOccurrence.compute(
                            currentWord,
                            (key, value) -> ++value
                    );
                }
            }
            // Make a list containing the top 10 words
            List<Integer> wordOccurrences = new ArrayList<>();
            for (String key : wordOccurrence.keySet()) {
                wordOccurrences.add(wordOccurrence.get(key));
            }

            wordOccurrences.sort(Collections.reverseOrder());

            writer = new BufferedWriter(new FileWriter(fileOutputPath));

            int currentVal;
            String keyToRemove = null;
            // Print top 10
            for (int i = 0; i < 10; i++) {
                currentVal = wordOccurrences.get(i);
                for (String key : wordOccurrence.keySet()) {
                    if (wordOccurrence.get(key).equals(currentVal)) {
                        writer.write(key + "-" + currentVal + "\n");
                        keyToRemove = key;
                        break;
                    }
                }
                if (wordOccurrence.containsKey(keyToRemove)) {
                    wordOccurrence.keySet().remove(keyToRemove);
                }
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Problem occurred at file reading");
        }
    }
}
