package code._4_student_effort.challenge_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class SecretMessage {
    public static void main(String[] args) {
        SecretMessage secretMessage = new SecretMessage();
        try {
            System.out.println(secretMessage.getSecretMessage());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private String getSecretMessage() throws FileNotFoundException {
        try (Scanner s = new Scanner(new BufferedReader(new FileReader("D:\\development\\workspace\\java-training\\_4_exceptions_io\\_test_files\\in\\message.txt")))) {
            StringBuilder message = new StringBuilder();
            while (s.hasNext()) {
                char[] str = s.next().toCharArray();
                for (char it: str) {
                    if (Character.isUpperCase(it)) {
                        char c = (it == 'X' ? ' ' : it);
                        message.append(c);
                    }
                }
            }
            return message.toString().trim();
        }
    }
}
