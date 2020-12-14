package code._4_student_effort.message;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Main {
    private URL url = new URL("https://raw.githubusercontent.com/miualinionut/java-training/master/_4_exceptions_io/_test_files/in/message.txt");

    private String output = "";

    public Main() throws IOException {
        Scanner scanner = new Scanner(url.openStream());

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            //System.out.println(line);

            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (Character.isUpperCase(c)) {
                    if (c == 'X') {
                        output += ' ';
                        continue;
                    }

                    output += c;
                }
            }
        }

        System.out.println(output);
    }

    public static void main(String[] args) {
        try {
            new Main();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
