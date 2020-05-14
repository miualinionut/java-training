package code._4_student_effort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecretMessage {

    public static void main(String[] args) {
        String fileName = "_4_exceptions_io/_test_files/in/message.txt";
        String input;
        try {
            input = readInputAndGetSecretMessage(fileName);
            System.out.println(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readInputAndGetSecretMessage(String fileName) throws IOException {
        Scanner scanner = null;
        List<String> words = new ArrayList<>();
        try {
            scanner = new Scanner(new BufferedReader(new FileReader(fileName)));
            while (scanner.hasNext()) {
                words.add(scanner.next());
            }
        } finally {
            if (null != scanner) scanner.close();
        }

        StringBuilder text = new StringBuilder();
        words.forEach(
                word -> {
                    char[] currentWord = word.toCharArray();
                    for (char c : currentWord) {
                        if (c >= 'A' && c <= 'Z')
                            if (c == 'X')
                                text.append(" ");
                            else
                                text.append(c);
                    }
                }
        );
        return text.toString();
    }


}
