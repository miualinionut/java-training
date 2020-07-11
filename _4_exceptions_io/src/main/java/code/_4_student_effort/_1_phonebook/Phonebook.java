package code._4_student_effort._1_phonebook;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Phonebook {
    private static final String FILE_PATH = "_4_exceptions_io\\_test_files\\in\\phonebook.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new BufferedReader(new FileReader(FILE_PATH)));

        String abbey = null;
        String abdul = null;
        while (s.hasNextLine()){
            String registry = s.nextLine();
            for(int i = 0; i < registry.lines().count(); i++){
                String[] person = registry.split(" ");
                if(person[0].equals("Abbey")){
                    abbey = person[1];
                }
                else if(person[0].equals("Abdul")){
                    abdul = person[1];
                }
            }
            if(abbey != null && abdul != null)
                break;
        }
        System.out.println("Abbey: " + abbey);
        System.out.println("Abdul: " + abdul);
    }
}
