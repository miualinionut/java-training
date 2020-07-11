package code._4_student_effort._2_secret_message;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class SecretMessage {
    private static final String FILE_PATH = "_4_exceptions_io\\_test_files\\in\\message.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new BufferedReader(new FileReader(FILE_PATH)));
        String output = "";

        while (s.hasNext()){
            char[] word = s.next().toCharArray();
            for (char c : word) {
                if (Character.isUpperCase(c)){
                    if (c == 'X'){
                        output += " ";
                    }
                    else {
                        output += c;
                    }
                }
            }
        }
        s.close();
        System.out.println(output);
    }
}
