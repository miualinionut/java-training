package code._4_student_effort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Challenge_1_Phonebook {

    public static void main(String[] args) {
        try {
            String abbey = "Abbey";
            String abdul = "Abdul";
            String[] wordsInPhoneBook = readFile("_4_exceptions_io\\_test_files\\in\\phonebook.txt");
            System.out.println(searchPhoneNumberByName(abbey, wordsInPhoneBook));
            System.out.println(searchPhoneNumberByName(abdul, wordsInPhoneBook));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static String searchPhoneNumberByName(String name, String[] wordsInPhoneBook){
        int i;
        for(i=0;i<wordsInPhoneBook.length;i++)
            if(wordsInPhoneBook[i].equals(name))
                return wordsInPhoneBook[i+1];
         return "The number was not found";
    }

    private static String[] readFile(String filename) throws FileNotFoundException {
        String[] words = new String[0];
        int count=0;
        Scanner s=null;
        try {
            s = new Scanner(new BufferedReader(new FileReader(filename)));
            s.useLocale(Locale.US);
            while (s.hasNext()) {
                words = Arrays.copyOf(words, words.length + 1);
                words[count++] = s.next();
            }
        } finally {
            if(s!=null) s.close();
        }
        String[] finalWords= new String[count];
        System.arraycopy(words, 0, finalWords, 0, count);
        return finalWords;
    }
}
