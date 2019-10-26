package code._2_challenge._3_anagram;

import java.io.*;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {

    private static final String SMALL_LIST_FILE = "_4_exceptions_io\\_test_files\\in\\small_list.txt";
    private static final String BIG_LIST_FILE = "_4_exceptions_io\\_test_files\\in\\big_list.txt";
    private static final String OUTPUT_FILE = "_4_exceptions_io\\_test_files\\out\\anagram.txt";

    static int anagramCount = 0;
    static String[] anagramWords;

    public static void main(String[] args) {
        anagramWords = new String[0];

        String anagramWord = "listen";
        int n = anagramWord.length();
        permute(anagramWord, 0, n - 1);

        String[] words = new String[0];
        int countOfWords = 0;
        for(int i =0 ; i< anagramWords.length; i++) {
            try {
                words = Arrays.copyOf(words, words.length + 1);
                words[countOfWords++] = searchWord(anagramWords[i], readListOfWords(SMALL_LIST_FILE));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        writeInFile(words);
    }

    private static void permute(String str, int left, int right) {
        if (left == right) {
            anagramWords = Arrays.copyOf(anagramWords, anagramWords.length + 1);
            anagramWords[anagramCount++] = str;
            System.out.println(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                permute(str, left + 1, right);
                str = swap(str, left, i);
            }
        }
    }

    private static String swap(String initialString, int i, int j) {
        char temp;
        char[] charArray = initialString.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    private static String[] readListOfWords(String fileName) throws FileNotFoundException {
        String[] words = new String[0];
        Scanner s = null;
        int wordCount = 0;
        try {
            s = new Scanner(new BufferedReader(new FileReader(fileName)));
            s.useLocale(Locale.US);
            while (s.hasNext()) {
                words = Arrays.copyOf(words, words.length + 1);
                words[wordCount++] = s.next();
            }
        } finally {
            if (s != null) s.close();
        }

        String[] appropriateLengthWordsArray = new String[wordCount];
        System.arraycopy(words, 0, appropriateLengthWordsArray, 0, wordCount);
        return appropriateLengthWordsArray;
    }

    private static String searchWord(String name, String[] wordsInPhoneBook) {
        for (int i = 0; i < wordsInPhoneBook.length; i++) {
            if (wordsInPhoneBook[i].equals(name)) {
                return wordsInPhoneBook[i];
            }
        }
        return "";
    }

    private static void writeInFile(String[] words) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(OUTPUT_FILE));
            copy(words, bufferedWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copy(String[] words, Writer writer) throws IOException {
        try {
            for (int i = 0; i < words.length; i++) {
                writer.write(words[i]);
            }
        } finally {
            if (writer != null) writer.close();
        }
    }
}
