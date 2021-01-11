package code._4_student_effort.secret_message;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class SecretMessage {
    static final String PATH = "_4_exceptions_io\\_test_files\\in\\message.txt";

    public String readInput(String path) {
        String message = "";
        Scanner scanner = null;
        try {
            scanner = new Scanner(new BufferedReader(new FileReader(path)));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // check is it is capital letter
                for(int i = 0 ; i < line.length(); i++){
                    if(line.charAt(i) >= 'A' && line.charAt(i) <= 'Z'){
                        if (line.charAt(i) == 'X') {
                            message += " ";
                        } else {
                            message += line.charAt(i);
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        return message;
    }


    public static void main(String[] args) {
        SecretMessage obj = new SecretMessage();
        String secretMessage = obj.readInput(PATH);

        System.out.println(secretMessage);
    }
}
