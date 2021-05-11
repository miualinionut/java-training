package code._2_challenge._1_phonebook;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class Phonebook {
    private static int MAX_NUMBER = 1_000;

    public static void main(String[] args) {
        try {
            String abbey = "Abbey";
            String abdul = "Abdul";
            String[] wordsInPhoneBook = readPhoneBook("_4_exceptions_io\\_test_files\\in\\phonebook.txt");
            System.out.println(searchPhoneNumberByName(abbey, wordsInPhoneBook));
            System.out.println(searchPhoneNumberByName(abdul, wordsInPhoneBook));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static String searchPhoneNumberByName(String name, String[] wordsInPhoneBook) {
        for (int i = 0; i < MAX_NUMBER; i++) {
            if (wordsInPhoneBook[i].equals(name)) {
                return wordsInPhoneBook[i + 1];
            }
        }
        return "The number was not found";
    }

    private static String[] readPhoneBook(String fileName) throws FileNotFoundException {
        String[] words = new String[MAX_NUMBER];
        Scanner s = null;
        int wordCount = 0;
        try {
            s = new Scanner(new BufferedReader(new FileReader(fileName)));
            s.useLocale(Locale.US);
            while (s.hasNext() && wordCount < MAX_NUMBER) {
                words[wordCount++] = s.next();
            }
        } finally {
            if (s != null) s.close();
        }

        String[] appropriateLengthWordsArray = new String[wordCount];
        System.arraycopy(words, 0, appropriateLengthWordsArray, 0, wordCount);
        return appropriateLengthWordsArray;
    }
}
