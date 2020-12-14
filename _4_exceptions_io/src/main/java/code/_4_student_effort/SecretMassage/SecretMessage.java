package code._4_student_effort.SecretMassage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class SecretMessage {
    public static void main(String[] args) {
        String fileName = "_4_exceptions_io\\_test_files\\in\\message.txt";
        try {
            ArrayList<String> text = readFile(fileName);
            System.out.println(getMessage(text));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<String> readFile(String fileName) {
        ArrayList<String> text = new ArrayList<>();
        try {
            FileReader myFile = new FileReader(fileName);
            Scanner s = new Scanner(new BufferedReader( myFile));
            while(s.hasNext()) {
                text.add(s.next());
            }
            s.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return text;
    }
    public static String getMessage(ArrayList<String> text) {
        String message = "";
        for(int i = 0; i < text.size(); i++) {
            char[] word = text.get(i).toCharArray();
            for(Character c: word) {
                if(Character.isUpperCase(c)) {
                    if(c.equals('X')) {
                        message += " ";
                    } else {
                        message += c;
                    }
                }
            }
        }
        return message;
    }
}
