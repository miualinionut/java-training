package code._4_student_effort.phonebook;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    private ArrayList<String> names;
    static final String PATH = "_4_exceptions_io\\_test_files\\in\\phonebook.txt";

    PhoneBook() {
        names = new ArrayList<>();
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public void findSearchedName(ArrayList<String> phonebook, String name) {
        //System.out.println(phonebook.size());
        for (String currentName : phonebook) {
            if (currentName.contains(name)) {
                System.out.println(currentName);
            }
        }
    }

    public void getAllNames(ArrayList<String> phonebook, String path) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new BufferedReader(new FileReader(path)));

            while (scanner.hasNextLine()) {
                String current = scanner.nextLine();
                phonebook.add(current);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    public static void main(String[] args) {
        String searchedName1 = "Abbey";
        String searchedName2 = "Abdul";

        PhoneBook obj = new PhoneBook();
        obj.getAllNames(obj.getNames(), PATH);

        // find numbers by name
        obj.findSearchedName(obj.getNames(), searchedName1);
        obj.findSearchedName(obj.getNames(), searchedName2);
    }
}
