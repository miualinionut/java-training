package code._4_student_effort.phonebook;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private URL url = new URL("https://raw.githubusercontent.com/miualinionut/java-training/master/_4_exceptions_io/_test_files/in/phonebook.txt");

    private String name1 = "Abbey";
    private String name2 = "Abdul";

    private List<Phonebook> phonebook = new ArrayList<>();

    public Main() throws IOException {
        Scanner scanner = new Scanner(url.openStream());

        // problema se poate rezolva direct din citire, dar pentru exercitiu, am creeat o clasa folosing Builder DP
        System.out.println("Numbers by name: ");
        while (scanner.hasNextLine()) {
            String name   = scanner.next();
            String number = scanner.next();

            phonebook.add(new Phonebook.Builder(name, number).build());
            if (name.equals(name1) || name.equals(name2)) {
                System.out.println(name + ": " + number);
            }
        }

        /*
        // print the entire list
        System.out.println("full list: ");
        while(phonebook.iterator().hasNext())
            System.out.println(phonebook.iterator().next().getName() + ": " + phonebook.iterator().next().getNumber());
         */
    }

    public static void main(String[] args) {
        try {
            new Main();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
