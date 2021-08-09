package code._4_student_effort.challenge2;

import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) throws IOException {
        String text = Read();
        String message = "";

        for(int i = 0;i<text.length();i++){
            if(Character.isUpperCase(text.charAt(i)) && text.charAt(i) == 'X'){
                message = message + " ";
            }
            else if(Character.isUpperCase(text.charAt(i))){
                message = message + text.charAt(i);
            }
        }
        System.out.println(message); // JAVA ROCKS :)

    }

    private static String Read() throws IOException {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get("C:\\development\\workspace\\java-training\\_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\challenge2\\text.txt")));
        return data;
    }
}
