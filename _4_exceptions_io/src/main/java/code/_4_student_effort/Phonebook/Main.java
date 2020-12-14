package code._4_student_effort.Phonebook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = "_4_exceptions_io\\_test_files\\in\\phonebook.txt";
        try {
            ArrayList<String> phoneBook = readFile(fileName);
            System.out.println(searchNumber("Abbey", phoneBook));
            System.out.println(searchNumber("Abdul", phoneBook));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static  ArrayList<String> readFile(String fileName) throws FileNotFoundException {
        ArrayList<String> namesNumbers = new ArrayList<>();
        Scanner s = null;
        try {
            FileReader myFile = new FileReader(fileName);
            s = new Scanner(new BufferedReader( myFile));
            while(s.hasNext()) {
                namesNumbers.add(s.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        s.close();
        return namesNumbers;
    }
    public static String searchNumber(String name, ArrayList<String> phoneBook) {
        for(int i = 0; i < phoneBook.size(); i++) {
            if(name.equals(phoneBook.get(i))) {
                return phoneBook.get(i+1);
            }
        }
        return "Not found";
    }
}
