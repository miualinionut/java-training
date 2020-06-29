package code._4_student_effort._5_occurence;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] words = readWords();
        NumberOfOcc[] uniqueWords = countAppearances(words);

        sortWordApperances(uniqueWords);
        displayFirst10(uniqueWords);
    }

    private static String[] readWords() throws FileNotFoundException {
        String[] words = new String[0];
        try (Scanner s = new Scanner(new BufferedReader(new FileReader("_4_exceptions_io\\_test_files\\in\\message.txt")))) {
            s.useLocale(Locale.US);
            while (s.hasNext()) {
                words = Arrays.copyOf(words, words.length + 1);
                words[words.length - 1] = s.next();
            }
        }
        return words;
    }

    private static NumberOfOcc[] countAppearances(String[] words) {
        NumberOfOcc[] uniqueWords = new NumberOfOcc[][0];
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            NumberOfOcc wordOccurrence = existsInUniqueList(uniqueWords, word);
            if (wordOccurrence != null) {
                wordOccurrence.increaseNumber();
            } else {
                uniqueWords = Arrays.copyOf(uniqueWords, uniqueWords.length + 1);
                uniqueWords[uniqueWords.length - 1] = new NumberOfOcc(word);
            }
        }
        return uniqueWords;
    }

    private static NumberOfOcc existsInUniqueList(NumberOfOcc[] uniqueWords, String word) {
        for (int i = 0; i < uniqueWords.length; i++) {
            NumberOfOcc wordOccurrence = uniqueWords[i];
            if (wordOccurrence.getWord().equals(word)) {
                return wordOccurrence;
            }
        }
        return null;
    }

    private static void sortWordApperances(NumberOfOcc[] uniqueWords) {
        Arrays.sort(uniqueWords, new Comparator<NumberOfOcc>() {
            @Override
            public int compare(NumberOfOcc o1, NumberOfOcc o2) {
                return o2.getCounter().compareTo(o1.getCounter());
            }
        });
    }

    private static void displayFirst10(NumberOfOcc[] uniqueWords) {
        for (int i = 0; i < 10; i++) {
            System.out.println(uniqueWords[i].getCounter() + " - " + uniqueWords[i].getWord());
        }
    }
}
