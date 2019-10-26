package code._2_challenge._5_occurence;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

public class Occurrences {
  public static void main(String[] args) throws FileNotFoundException {
    String[] words = readWords();
    WordOccurrence[] uniqueWords = countAppearances(words);

    sortWordApperances(uniqueWords);
    displayFirst10(uniqueWords);
  }

  private static String[] readWords() throws FileNotFoundException {
    String[] words = new String[0];
    try (Scanner s = new Scanner(new BufferedReader(new FileReader("_4_exceptions_io\\_test_files\\in\\a.txt")))) {
      s.useLocale(Locale.US);
      while (s.hasNext()) {
        words = Arrays.copyOf(words, words.length + 1);
        words[words.length - 1] = s.next();
      }
    }
    return words;
  }

  private static WordOccurrence[] countAppearances(String[] words) {
    WordOccurrence[] uniqueWords = new WordOccurrence[0];
    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      WordOccurrence wordOccurrence = existsInUniqueList(uniqueWords, word);
      if (wordOccurrence != null) {
        wordOccurrence.increaseOccurrence();
      } else {
        uniqueWords = Arrays.copyOf(uniqueWords, uniqueWords.length + 1);
        uniqueWords[uniqueWords.length - 1] = new WordOccurrence(word);
      }
    }
    return uniqueWords;
  }

  private static WordOccurrence existsInUniqueList(WordOccurrence[] uniqueWords, String word) {
    for (int i = 0; i < uniqueWords.length; i++) {
      WordOccurrence wordOccurrence = uniqueWords[i];
      if (wordOccurrence.getWord().equals(word)) {
        return wordOccurrence;
      }
    }
    return null;
  }

  private static void sortWordApperances(WordOccurrence[] uniqueWords) {
    Arrays.sort(uniqueWords, new Comparator<WordOccurrence>() {
      @Override
      public int compare(WordOccurrence o1, WordOccurrence o2) {
        return o2.getOccurrence().compareTo(o1.getOccurrence());
      }
    });
  }

  private static void displayFirst10(WordOccurrence[] uniqueWords) {
    for (int i = 0; i < 10; i++) {
      System.out.println(uniqueWords[i].getOccurrence() + " - " + uniqueWords[i].getWord());
    }
  }

}
