package code._2_challenge._2_secret_message;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class SecretMessage {
    private static final String MESSAGE_FILE = "_4_exceptions_io\\_test_files\\in\\message.txt";

    public static void main(String[] args) {
        try {
            System.out.println(getSecretMessage(readWords(MESSAGE_FILE)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static String getSecretMessage(String[] words) {
        String secretMessage = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char[] letters = word.toCharArray();
            for (char letter : letters) {
                if (Character.isUpperCase(letter)) {
                    if (letter == 'X') {
                        secretMessage += " ";
                    } else {
                        secretMessage += letter;
                    }
                }
            }
        }
        return secretMessage;
    }

    private static String[] readWords(String fileName) throws FileNotFoundException {
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
}
