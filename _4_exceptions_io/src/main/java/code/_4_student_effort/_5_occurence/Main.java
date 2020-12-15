package code._4_student_effort._5_occurence;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Map<String, Integer> Words;
    static Integer maxOccurences;

    public static void readFile(){
        Words = new HashMap<>();
        try {
            File inputFile = new File("_4_exceptions_io\\_test_files\\in\\a.txt");
            Scanner reader = new Scanner(inputFile);
            reader.useLocale(Locale.ENGLISH);
            while(reader.hasNext()){
                String entry = reader.next();
                entry = entry.trim();
                if(Words.containsKey(entry)){
                    Words.replace(entry, Words.get(entry) + 1);
                }
                else{
                    Words.put(entry, 1);
                }

            }
        }catch (FileNotFoundException e){
            System.out.println("Error, File not found.");
            e.printStackTrace();
        }
    }
    public static void displayTopTen(){
        int maxOccurs;
        String[] topWords = new String[10];
        boolean exists = false;
        int index = 0;
        for(int i = 0; i < 10; i++){
            maxOccurs = 0;
            for(Map.Entry<String, Integer> entry : Words.entrySet()){

                if(maxOccurs < entry.getValue()){
                    exists = false;
                    for(int j = 0; j < index; j++){
                        if(topWords[j].equals(entry.getKey())){
                            exists = true;
                        }
                    }
                    if(!exists) {
                        maxOccurs = entry.getValue();
                        topWords[index] = entry.getKey();
                    }
                }
            }
            System.out.println(topWords[index++] + ": " + maxOccurs);
        }
    }

    public static void main(String[] args) {
        readFile();

        displayTopTen();
    }
}
