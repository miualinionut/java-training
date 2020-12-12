package code._4_student_effort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        try {
            File text = new File("C:\\Development\\workspace\\java-training\\_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\Phonebook.txt");
            Scanner reader = new Scanner(text);
            String[] names = {"Abbey", "Abdul"};
            String aux;
            int i;
            while(reader.hasNextLine()){
                aux = reader.nextLine();
                String auxArr[] = aux.split(" ");
                for(i = 0; i < names.length; i++){
                    if (auxArr[0].equals(names[i])){
                        System.out.println(auxArr[1]);
                    }
                }
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File could not be opened");
            e.printStackTrace();
        }

    }


}
