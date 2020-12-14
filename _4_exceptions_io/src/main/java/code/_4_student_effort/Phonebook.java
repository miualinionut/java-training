package code._4_student_effort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class Phonebook {

    private static String[] OpenPhoneBook(String file) throws FileNotFoundException{
        String[] words = new String[2000];
        int NumberOfWords=0;
        Scanner scan = null;
        try {
            scan = new Scanner(new BufferedReader(new FileReader(file)));
            scan.useLocale(Locale.US);
            while (scan.hasNext() && NumberOfWords < 2000) {
                words[NumberOfWords] = scan.next();
                NumberOfWords = NumberOfWords + 1;
            }
        } finally {
            if (scan != null) scan.close();
        }
        String[] WordsArray = new String[NumberOfWords];
        System.arraycopy(words, 0, WordsArray, 0, NumberOfWords);
        return WordsArray;
    }

    private static String SearchPhoneBook(String[] PhoneBookText, String name){
        int i = 0;
        String aux;
        while(i < 2000) {
            if (PhoneBookText[i].equals(name)){
                aux = PhoneBookText[i + 1];
                return aux;
            }
            else i = i + 1;
        }
        return "Name out of list.";
    }

    public static void main(String[] args) {
        try {
            String abbey = "Abbey";
            String abdul = "Abdul";
            String[] PhoneBookText = OpenPhoneBook("_4_exceptions_io\\_test_files\\in\\phonebook.txt");
            System.out.println(SearchPhoneBook(PhoneBookText, abbey));
            System.out.println(SearchPhoneBook(PhoneBookText, abdul));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
