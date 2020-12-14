package code._4_student_effort;

import java.io.*;
import java.net.SocketOption;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {
    static String[] anagram;
    static  int anagramNo = 0;

    private static String[] OpenText(String file) throws FileNotFoundException {
        String[] words = new String[0];
        int NumberOfWords=0;
        Scanner scan = null;
        try {
            scan = new Scanner(new BufferedReader(new FileReader(file)));
            scan.useLocale(Locale.US);
            while (scan.hasNext()) {
                words = Arrays.copyOf(words,words.length+1);
                words[NumberOfWords] = scan.next();
            }
        } finally {
            if (scan != null) scan.close();
        }
        String[] WordsArray = new String[NumberOfWords];
        System.arraycopy(words, 0, WordsArray, 0, NumberOfWords);
        return WordsArray;
    }

    private static void Copy(String[] words, Writer writer) throws  IOException{
        try {
            for (String word : words) writer.write(word);
        }
        finally {
            if(writer != null)
                writer.close();
        }

    }

    private static void WriteText(String[] words) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("_4_exceptions_io\\_test_files\\out\\anagram.txt"));
            Copy(words, bufferedWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String SearchPhoneBook(String[] PhoneBookText, String name){
        int i = 0;
        String aux;
        while(i < PhoneBookText.length) {
            if (PhoneBookText[i].equals(name)){
                aux = PhoneBookText[i];
                return aux;
            }
            else i = i + 1;
        }
        return " ";
    }

    private static  String  SwapChar(int pos1, int pos2, String text){
        char[] TextChar = text.toCharArray();
        char aux;
        aux = TextChar[pos1];
        TextChar[pos1] = TextChar[pos2];
        TextChar[pos2] = aux;
        return String.valueOf(TextChar);
    }

    private static void PermuteChar(int l, int r, String text){
        if(l == r){
            anagram = Arrays.copyOf(anagram, anagram.length + 1);
            anagram[anagramNo++] = text;
            System.out.println(text);
        }
        else{
            for(int i = l;  i< r; i++)
            {
                text = SwapChar(l,i,text);
                PermuteChar(l+1,r,text);
                text = SwapChar(l,i,text);
            }
        }
    }

    public static void main(String[] args) {
        anagram = new String[0];

        String anagramWord = "listen";
        int n = anagramWord.length();
        PermuteChar(0 , n-1, anagramWord);
        String[] words = new String[0];
        int wordsNo = 0;
        for (String s : anagram) {
            try {
                words = Arrays.copyOf(words, words.length + 1);
                words[wordsNo++] = SearchPhoneBook(OpenText("_4_exceptions_io\\_test_files\\in\\small_list.txt"), s);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        WriteText(words);
    }
}
