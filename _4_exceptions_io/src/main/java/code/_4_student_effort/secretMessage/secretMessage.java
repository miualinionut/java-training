package code._4_student_effort.secretMessage;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

//extract upperCase letter
//if X == true => add " "
public class secretMessage {
    public static void main(String[] args) throws IOException {
        String FileName = "C:\\development\\WorkSpace\\java-training\\_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\secretMessage\\message.txt";
        try {

            String[] inputFile = readfromFile(FileName);
            BufferedInputStream bin = new BufferedInputStream(new FileInputStream(FileName));
            byte[] buffer = new byte[(int) FileName.length()];
            bin.read(buffer);
            String fileStr = new String(buffer);
            System.out.println(fileStr);
            System.out.println(getUpperCaseWord(inputFile));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static String getUpperCaseWord(String[] words) {
        String eachWordContainer = new String(" ");
        for (int i = 0; i < words.length; i++) {
            String eachWordPosition = words[i];
            char[] eachLetter = eachWordPosition.toCharArray();
            for (int j = 0; j < eachLetter.length; j++) {
                if (Character.isUpperCase(eachLetter[j])) {
                    if (eachLetter[j] == 'X') {
                        eachWordContainer += " ";
                    } else {
                        eachWordContainer += eachLetter[j];
                    }
                }
            }
        }
        return eachWordContainer;
    }


    public static String[] readfromFile(String fileName) throws IOException {
        String[] words = new String[0];
        Scanner s = null;
        int count = 0;
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        try {
            s = new Scanner(br);
            while (s.hasNext()) {
                words = Arrays.copyOf(words, words.length + 1);
                words[count++] = s.next();

            }
        } finally {
            if (s != null) br.close();
        }
        String[] totalCounts = new String[count];
        System.arraycopy(words, 0, totalCounts, 0, count);
        System.out.println(totalCounts);
        return totalCounts;
    }


}
