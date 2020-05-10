package code._4_student_effort.Phonebook;

import java.io.*;
import java.util.StringTokenizer;

public class PhonebookTest {

    public static void main(String[] args) {

        File fisier = new File("C:/development/workspace/java-training/_4_exceptions_io/_test_files/in/phonebook.txt");

        try {
            FileReader fr = new FileReader(fisier);
            BufferedReader br = new BufferedReader(fr);

            String linieCurenta;
            while((linieCurenta = br.readLine())!= null){
                if (linieCurenta.contains("Abbey") == true){
                    StringTokenizer nrTelefon = new StringTokenizer(linieCurenta," ");
                    nrTelefon.nextToken();
                    System.out.println(nrTelefon.nextToken());
                }
                if (linieCurenta.contains("Abdul") == true){
                    StringTokenizer nrTelefon = new StringTokenizer(linieCurenta," ");
                    nrTelefon.nextToken();
                    System.out.println(nrTelefon.nextToken());
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
