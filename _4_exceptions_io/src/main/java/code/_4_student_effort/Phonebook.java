package code._4_student_effort;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class Phonebook {
    private static int MAX_NR = 1_000;

    public static void main(String[] args) {
        try {
            String abbey = "Abbey";
            String abdul = "Abdul";
            String[] namesInPhoneBook = readPhoneBook("_4_exceptions_io\\_test_files\\in\\phonebook.txt");
            System.out.println(searchPhoneNrbyName(abbey, namesInPhoneBook));
            System.out.println(searchPhoneNrbyName(abdul, namesInPhoneBook));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static String searchPhoneNrbyName(String name, String[] namesInPhoneBook) {
        for (int i = 0; i < MAX_NR; i++) {
            if (namesInPhoneBook[i].equals(name)) {
                return namesInPhoneBook[i + 1];
            }

        }
        return "Nr-ul nu a fost gasit ";
    }

    private static String[] readPhoneBook(String filename) throws FileNotFoundException {
        String[] words = new String[MAX_NR];
        Scanner s = null;
        int wordCount = 0;
        try {
            s = new Scanner(new BufferedReader(new FileReader(filename)));
            s.useLocale(Locale.US);
            while (s.hasNext() && wordCount < MAX_NR) {
                words[wordCount++] = s.next();

            }
        } finally {
            if (s != null) s.close();
        }
        String[] aproxLengthNamesArray = new String[wordCount];
        System.arraycopy(words,0, aproxLengthNamesArray, 0, wordCount);
        return aproxLengthNamesArray;

    }
}
