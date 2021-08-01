package code._4_student_effort.challenge_4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class NumberToLcd {
    public static void main(String[] args) {

    }

    public static String[] readFromFile(String path) throws FileNotFoundException {
        int counter = 0;
        Scanner s = null;
        String[] words = new String [1000];

        try{
            s = new Scanner(new BufferedReader(new FileReader(path)));
            while(s.hasNext() && counter < 1000)
                words[counter++] = s.next();
        }
        finally {
            if(s!=null) s.close();
        }

        String[] finalString = new String[counter];
        System.arraycopy(words,0,finalString, 0, counter);
        return finalString;


    }
}
