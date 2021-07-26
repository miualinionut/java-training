package code._4_student_effort.CodeChallange1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        try {
            List<String> phonebookAgenda = readPhonebook("_4_exceptions_io\\_test_files\\in\\phonebook.txt");
            System.out.println("Abbey: " + searchForNumber("Abbey", phonebookAgenda));
            System.out.println("Abdul: " + searchForNumber("Abdul", phonebookAgenda));
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    private static String searchForNumber(String name, List<String> phonebookAgenda){
        for(int i = 0; i < phonebookAgenda.size(); i += 2){
            if(phonebookAgenda.get(i).equals(name)){
                return phonebookAgenda.get(i + 1);
            }
        }
        return "Number not found!";
    }

    private static List<String> readPhonebook(String filename) throws FileNotFoundException{
        List<String> phonebookAgenda = new ArrayList<>();
        Scanner s = null;
        try {
            s = new Scanner(new BufferedReader(new FileReader(filename)));
            s.useLocale(Locale.US);
            while (s.hasNext()){
                phonebookAgenda.add(s.next());
            }
        } finally {
            if(s != null){
                s.close();
            }
        }
        return phonebookAgenda;
    }
}
