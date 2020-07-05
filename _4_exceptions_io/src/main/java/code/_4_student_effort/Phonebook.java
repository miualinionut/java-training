package code._4_student_effort;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Phonebook {

    private static List<String> read (String filename) {
        List<String> words = new ArrayList<>();
        String filepath = new File("").getAbsolutePath();
        try (Scanner s = new Scanner(new BufferedReader(new FileReader(filepath + filename)))) {
            while (s.hasNext()) {
                words.add(s.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return words;
    }

    private static String findByName(String name, List<String> phoneBook) {
        for (int i = 0; i < phoneBook.size(); i++) {
            if (phoneBook.get(i).equals(name)) {
                return phoneBook.get(i + 1);
            }
        }
        return "NumberNotFound";
    }

    public static void main(String[] args) {
        String filename = "/_test_files/in/phonebook.txt";
//        String filename = "/home/adrian/Documents/google-atelierul-digital/java-training/_4_exceptions_io/_test_files/in/phonebook.txt";
        String abbey = "Abbey";
        String abdul = "Abdul";

        List<String> phoneBook = read(filename);

        System.out.println(abbey + " number is: " + findByName(abbey, phoneBook));
        System.out.println(abdul + " number is: " + findByName(abdul, phoneBook));

    }

}
