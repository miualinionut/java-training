package code._4_student_effort._3_anagram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static String wordToSearch;
    public static void searchAnagram(){
        char[] sortedWord = wordToSearch.toCharArray();
        Arrays.sort(sortedWord);

        try {
            File inputFile = new File("_4_exceptions_io\\_test_files\\in\\big_list.txt");
            Scanner reader = new Scanner(inputFile);

            while(reader.hasNextLine()){
                String entry = reader.nextLine();
                entry = entry.trim();

                if(wordToSearch.length() == entry.length()){

                    char[] sortedEntry = entry.toCharArray();
                    Arrays.sort(sortedEntry);

                    if(Arrays.equals(sortedWord, sortedEntry)){
                        System.out.println(entry);
                    }
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Error, File not found.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        wordToSearch = "listen";
        searchAnagram();
    }
}
