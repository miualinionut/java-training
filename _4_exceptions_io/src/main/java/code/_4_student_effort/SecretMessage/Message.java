package code._4_student_effort.SecretMessage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Message {


    public static String decode(String path) throws FileNotFoundException {
        String hiddenMessage="";
        File source=null;
        Scanner scan=null;
        try{
            source= new File(path);
            scan= new Scanner(source);
            while (scan.hasNextLine()){
                String row=scan.next();
                for(int i=0;i<row.length();i++){
                    char letter=row.charAt(i);
                    if(letter>='A'&&letter<='Z'){
                        if(letter=='X'){
                            hiddenMessage+=' ';
                        }
                        else hiddenMessage+=letter;
                    }
                }

            }
        }finally {
            if(scan !=null) scan.close();
        }
        return hiddenMessage;
    }


    public static void main(String[] args) {


        String path="C:\\development\\workspace\\java-training\\_4_exceptions_io\\_test_files\\in\\message.txt";
        String message="";
        try{
          message=decode(path);
        }catch (FileNotFoundException exc){
            exc.printStackTrace();
        }

        System.out.println(message);



    }
}
