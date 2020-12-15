package code._4_student_effort._1_phonebook;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Map<String, String> phoneBook = new HashMap<>();

    public static void readFile(){
        try {
            File inputFile = new File("_4_exceptions_io\\_test_files\\in\\phonebook.txt");
            Scanner reader = new Scanner(inputFile);
            while(reader.hasNextLine()){
                String entry = reader.nextLine();
                String[] entryElements = entry.split(" ");
                phoneBook.put(entryElements[0], entryElements[1]);
            }
        }catch (FileNotFoundException e){
            System.out.println("Error, File not found.");
            e.printStackTrace();
        }
    }

    public static void getNumbersOf(String[] people){
        for(String person : people)
        {
            String number = phoneBook.get(person);
            if(number != null)
                System.out.println(person + ": " + number);
            else
                System.out.println(person + " is not in the phonebook...");
        }
    }

    public static void main(String[] args) {
        readFile();
        String[] people = {
                "Abbey",
                "Abdul",
                "Santa",
                "dassdsa"
        };
        getNumbersOf(people);
    }
}
