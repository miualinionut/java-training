package code._4_student_effort._2_secret_message;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        Secret  secret = new Secret();
        String filePath = "_4_exceptions_io\\_test_files\\in\\message.txt";
        try {
            var words = secret.transformStringIntoArrayOfStrings((filePath));
            var message = secret.getMessage(words);
            System.out.println(message);
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
