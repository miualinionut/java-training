package code._4_student_effort.challenge2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class secretMessage {

    public static void stringToGet(String input){


        StringBuilder stringToBeReturned = new StringBuilder();
        for(int i=0;i<input.length();i++){
            if(Character.isUpperCase(input.charAt(i))){
                if(input.charAt(i)=='X'){
                    stringToBeReturned.append(" ");
                    continue;
                }
                stringToBeReturned.append(input.charAt(i));
            }
        }
System.out.println(stringToBeReturned.toString());
    }

    public static String fromInput() {

        StringBuilder stringToBeReturned = new StringBuilder();
        Scanner sc2 = null;
        try {
            sc2 = new Scanner(new File("E:\\programare\\cursGoogle\\java-training\\_4_exceptions_io\\secretCode.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (sc2.hasNextLine()) {
            Scanner s2 = new Scanner(sc2.nextLine());
            while (s2.hasNext()) {
                String s = s2.next();

                //System.out.println(s);
                stringToBeReturned.append(s);
            }
        }

        return stringToBeReturned.toString().replaceAll("\\r|\\n", "");
    }
}
