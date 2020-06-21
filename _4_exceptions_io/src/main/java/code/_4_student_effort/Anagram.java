package code._4_student_effort;

import java.io.*;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {
    private static final String SMALL_LIST_FILE = "_4_exceptions_io\\_test_files\\in\\small_list.txt";
    private static final String BIG_LIST_FILE = "_4_exceptions_io\\_test_files\\in\\big_list.txt";
    private static final String OUTPUT_FILE = "_4_exceptions_io\\_test_files\\out\\anagram.txt";

    public static void main(String[] args) {
        String str = "listen";
        int n = str.length();
        Anagram permutation = new Anagram();
        permutation.permute(str, 0, n - 1);
    }

    private void permute(String str, int l, int r) {
        if (l == r)
            System.out.println(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    public String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
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

    private static String searchWord(String a, String[] wordsInPhoneBook) {
        for (int i = 0; i < wordsInPhoneBook.length; i++) {
            if (wordsInPhoneBook[i].equals(a)) {
                return wordsInPhoneBook[i];
            }
        }
        return "";

    }

    private static void writeInFile(String[] words) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(OUTPUT_FILE));
            printcopy(words, bufferedWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printcopy(String[] words, Writer writer) throws IOException {
        try {
            for (int i = 0; i < words.length; i++) {
                writer.write(words[i]);
            }
        } finally {
            if (writer != null) writer.close();
        }
    }
}
