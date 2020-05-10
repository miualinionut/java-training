package code._4_student_effort.NumberToLcd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberLcd {


    public static void convert(ArrayList<Integer> arr,int width,int height){
        for(int i=0;i<height;i++){
            System.out.println(' ');
            for(Integer j:arr){
                    switch (j){
                        case 1:{
                            if(i==0) {
                                for(int k=0;k<width;k++) {

                                    System.out.print(' ');

                                }
                            }
                            else{

                                for(int k=0;k<width-1;k++){
                                    System.out.print(' ');
                                }
                            System.out.print('|');}
                            break;
                        }
                        case 2:{
                            if(i==0) {
                                for(int k=0;k<width;k++) {

                                    System.out.print('_');

                                }
                            }
                            else if(i== height/2){
                                for(int k=0;k<width;k++){
                                    System.out.print('_');
                                }
                                System.out.print('|');
                            }
                            else if(i==height-1){
                                System.out.print('|');
                                for(int k=0;k<width;k++){
                                    System.out.print('_');
                                }
                            }
                            else if(i>height/2){
                                System.out.print('|');
                            }
                            else if(i<height/2){
                                for(int k=0;k<width;k++){
                                    System.out.print(' ');
                                }
                                System.out.print('|');
                            }

                        }
                    }

            }
        }

    }

    public static void main(String[] args) {

        File input=null;
        Scanner scan=null;
    try{

          input= new File("C:\\development\\workspace\\java-training\\_4_exceptions_io\\_test_files\\in\\input_number.txt");
          scan=new Scanner(input);
        FileWriter myWriter = new FileWriter("C:\\development\\workspace\\java-training\\_4_exceptions_io\\_test_files\\out\\output_number.txt");
        ArrayList<Integer> arr=new ArrayList<>();
        String scanned=scan.next();
        for(int i=0;i<scanned.length();i++){
            arr.add((Integer)(int)scanned.charAt(i)-(Integer)(int)'0');
        }

        convert(arr,3,5);

     } catch (IOException e ) {
        e.printStackTrace();
        }
}
}
