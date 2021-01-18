package code._4_student_effort.Anagram;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;   // Import the FileWriter class
//import java.io.IOException;
//1-READ FROM FILE
//2-SEARCH WORD
//3-

public class AngramClass {
    private static final String BIG_LIST = "C:\\development\\WorkSpace\\java-training\\_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\Anagram\\big_list.txt";
    private static final String SMALL_LIST = "C:\\development\\WorkSpace\\java-training\\_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\Anagram\\small_list.txt";
    private static final String OUTPUT_ANAGRAM = "C:\\development\\WorkSpace\\java-training\\_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\Anagram\\anagram.txt";
    static int anagramCount = 0;
    static String[] anagramWords;

    public static void main(String[] args) {
        anagramWords = new String[0];

        String anagramWord = "listen";
        int n = anagramWord.length();
        permute(anagramWord, 0, n - 1);

        String[] words = new String[0];
        int countOfWords = 0;
        for (int i = 0; i < anagramWords.length; i++) {
            try {
                words = Arrays.copyOf(words, words.length + 1);
                words[countOfWords++] = searchWord(anagramWords[i], readfromFile(SMALL_LIST));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        FileWritter(words);
    }



    public static String[] readfromFile(String fileName) throws FileNotFoundException {
        String[] words = new String[0];
        Scanner s = null;
        int count = 0;

        try {
            s =  new Scanner(new BufferedReader(new FileReader(fileName)));
            while (s.hasNext()) {
                words = Arrays.copyOf(words, words.length + 1);
                words[count++] = s.next();

            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
        String[] totalCounts = new String[count];
        System.arraycopy(words, 0, totalCounts, 0, count);
        System.out.println(totalCounts);
        return totalCounts;
    }

    public static String searchWord(String name, String[] wordsInFILE) {
        for (int i = 0; i < wordsInFILE.length; i++) {
            if (wordsInFILE[i].equals(name)) {
                return wordsInFILE[i];
            }
        }
        return "Not Found ";
    }

    //create file
//    public class CreateFile {
//        public static void main(String[] args) {
//            try {
//                File myObj = new File("output.txt");
//                if (myObj.createNewFile()) {
//                    System.out.println("File created: " + myObj.getName());
//                } else {
//                    System.out.println("File already exists.");
//                }
//            } catch (IOException e) {
//                System.out.println("An error occurred.");
//                e.printStackTrace();
//            }
//        }
//    }
    private static void permute(String str, int left, int right) {
        if (left == right) {
            anagramWords = Arrays.copyOf(anagramWords, anagramWords.length + 1);
            anagramWords[anagramCount++] = str;
            System.out.println(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                permute(str, left + 1, right);
                str = swap(str, left, i);
            }
        }
    }

    private static String swap(String initialString, int i, int j) {
        char temp;
        char[] charArray = initialString.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void FileWritter(String[] words) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(OUTPUT_ANAGRAM));
            copy(words, bufferedWriter);

//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        BufferedWriter bw = null;
//        FileWriter fw = null;
//        try {
//            fw = new FileWriter(OUTPUT_ANAGRAM);
//            bw = new BufferedWriter(fw);
//            for (int i = 0; i < words.length; i++) {
//                writer.write(words[i]);
//            }
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copy(String[] words, Writer writer) throws IOException {
        try {
            for(int i=0; i< words.length; i++){
                writer.write(words[i]);
            }
        } finally {
            if (writer != null) writer.close();
        }
    }
}


