package code._4_student_effort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class PhoneBook {
    private static final int MAX_WORDS = 1000;

    public static void main(String[] args) {

        try {
            String[] phoneBook = readPhoneBook("_4_exceptions_io/_test_files/in/phonebook.txt");
            String abbey = "abbey";
            String abdul = "abdul";
            System.out.println(searchForName(abbey, phoneBook));
            System.out.println(searchForName(abdul, phoneBook));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String searchForName (String nameToSearchFor, String[] phoneBook) {
        for (int i = 0; i < phoneBook.length; i++) {
            if (phoneBook[i].toLowerCase().equals(nameToSearchFor))
                return phoneBook[i + 1];
        }
        return "Not found";
    }

    private static String[] readPhoneBook(String fileName) throws IOException {
        String[] words = new String[MAX_WORDS];
        Scanner scanner = null;
        int wordCount = 0;
        try {
            scanner = new Scanner(new BufferedReader(new FileReader(fileName)));
            scanner.useLocale(Locale.US);
            while (scanner.hasNext() &&  wordCount < MAX_WORDS) {
                words[wordCount++] = scanner.next();
            }
        } finally {
            if (null != scanner) scanner.close();
        }
        return words;
    }
}
