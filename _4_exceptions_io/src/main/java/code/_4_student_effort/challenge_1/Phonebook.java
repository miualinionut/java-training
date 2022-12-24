package code._4_student_effort.challenge_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        try {
            String firstNumber = phonebook.getPhoneNumber("Abbey");
            String secondNumber = phonebook.getPhoneNumber("Abdul");
            System.out.println(firstNumber + ", " + secondNumber);
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
    }

    private String getPhoneNumber(String name) throws FileNotFoundException {
        try (Scanner s = new Scanner(new BufferedReader(new FileReader("D:\\development\\workspace\\java-training\\_4_exceptions_io\\_test_files\\in\\phonebook.txt")))) {
            while (s.hasNextLine()) {
                String entry = s.nextLine();
                String[] arr;
                arr = entry.split(" ");
                if (arr[0].equals(name))
                    return arr[1];
            }
            return name + "'s number was not found";
        }
    }
}
