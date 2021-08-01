package code._4_student_effort.challenge_3;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args){
        try {
            String[] words = getWords("_4_exceptions_io\\_test_files\\in\\big_list.txt");
            String[] anagrams = getAnagramsForListen(words);
            writeInFile(anagrams, "_4_exceptions_io\\_test_files\\out\\anagram.txt");
            for(int i = 0; i< anagrams.length; i++)
                System.out.println(anagrams[i]);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }




    }

    public static String [] getAnagramsForListen(String[] words){
        String word = "listen";
        String[] anagrams = new String[500];
        char[] wordChars = word.toCharArray();
        Arrays.sort(wordChars);
        System.out.println(wordChars);

        int counter = 0;

        for(int i = 0; i < words.length; i++){
            char[] item = words[i].toCharArray();
            Arrays.sort(item);
            if(Arrays.equals(wordChars,item) && counter < anagrams.length && wordChars.length == item.length){
                anagrams[counter++] = words[i];
            }


        }

        String[] finalStrings = new String[counter];
        System.arraycopy(anagrams,0,finalStrings,0,counter);
        return finalStrings;



    }
    public static void writeInFile(String[] anagrams, String path){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            for (int i = 0; i < anagrams.length; i++)
                writer.write(anagrams[i]);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String [] getWords(String filePath) throws FileNotFoundException {
        String[] words = new String [370100];
        int counter = 0;
        Scanner s = null;

        try{
            s = new Scanner(new BufferedReader(new FileReader(filePath)));
            while(s.hasNext() && counter < 370100){
                words[counter++] = s.next();

            }}
            finally{
                if(s!=null) s.close();
            }
            String [] finalString = new String[counter];
            System.arraycopy(words,0,finalString,0,counter);
            return finalString;
        }


}
