package code._4_student_effort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class SecretMessage {

    private static String[] OpenText(String file) throws FileNotFoundException {
        String[] words = new String[0];
        int NumberOfWords=0;
        Scanner scan = null;
        try {
            scan = new Scanner(new BufferedReader(new FileReader(file)));
            scan.useLocale(Locale.US);
            while (scan.hasNext()) {
                words = Arrays.copyOf(words,words.length+1);
                words[NumberOfWords] = scan.next();
            }
        } finally {
            if (scan != null) scan.close();
        }
        String[] WordsArray = new String[NumberOfWords];
        System.arraycopy(words, 0, WordsArray, 0, NumberOfWords);
        return WordsArray;
    }

    private static String DecriptSecretMessage(String[] words) {
        String decriptedMessage = "";
        for (String singleword : words) {
            char[] letters = singleword.toCharArray();
            for (char letter : letters) {
                if (Character.isUpperCase(letter)) {
                    if (letter == 'X')
                        decriptedMessage = decriptedMessage + " ";
                    else decriptedMessage = decriptedMessage + letter;
                }
            }
        }
        return decriptedMessage;
    }


    public static void main(String[] args) {
        try {
            System.out.println(DecriptSecretMessage(OpenText("_4_exceptions_io\\_test_files\\in\\message.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
