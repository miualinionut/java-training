package code._4_student_effort._2_secret_message;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Secret {

    public String getMessage(ArrayList<String> words)
    {
        String message = "";
        for(String word : words)
        {
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if(c == 'X')
                {
                    message += " ";
                }
                else
                {
                    message += Character.isUpperCase(c) ? c : "";
                }
            }
        }
        return message;
    }

    public ArrayList<String> transformStringIntoArrayOfStrings(String file) throws FileNotFoundException {
        Scanner sc2 = null;
        ArrayList<String> words = new ArrayList<String>();
            sc2 = new Scanner(new File(file));
        while (sc2.hasNextLine()) {
            Scanner s2 = new Scanner(sc2.nextLine());
            while (s2.hasNext()) {
                String s = s2.next();
                words.add(s);
            }
        }
        return words;
    }
}
