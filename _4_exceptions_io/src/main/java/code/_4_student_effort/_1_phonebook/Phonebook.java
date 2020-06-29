package code._4_student_effort._1_phonebook;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        try {
            String abbey = "Abbey";
            String abdul = "Abdul";
            String[] dataPhone = readFromFile("_4_exceptions_io\\_test_files\\in\\phonebook.txt");
            System.out.println(searchNumber(abbey, dataPhone));
            System.out.println(searchNumber(abdul, dataPhone));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static String[] readFromFile(String filename) throws FileNotFoundException{
        String[] dword = new String[1000];
        Scanner s = null;
        int i = 0;
        try{
            s =  s = new Scanner(new BufferedReader(new FileReader(filename)));
            while (s.hasNext() && i < 1000) {
                dword[i++] = s.next();
            }
        } finally {
            if (s != null) s.close();
        }
        String[] fword = new String[i];
        System.arraycopy(dword, 0, fword, 0, i);
        return fword;
    }

    private static String searchNumber(String name, String[] dataFromBook){
        for (int i = 0; i < 1000; i++) {
            if (dataFromBook[i].equals(name)) {
                return dataFromBook[i + 1];
            }
        }
        return "Not found";
    }
}
