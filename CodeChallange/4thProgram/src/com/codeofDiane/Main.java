package com.codeofDiane;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scan.nextInt();
        int[] array = new int[size];
        int index1, index2, index3, index4;
        int sum = 0;
        int counter = 0;
        System.out.println("Enter the elements of the array:");
        for (index1 = 0 ; index1 < array.length; index1++) {
            array[index1] = scan.nextInt();
            System.out.println(array[index1]);
        }
        for(index2 = 0; index2 < array.length-2; index2++){
            if(array[index2] != 0){
                for(index3 = index2+1; index3 < array.length-1; index3++){
                    if(array[index3] != 0){
                        for(index4 = index3 + 1; index4 <array.length; index4++){
                            if(array[index2] + array[index3] + array[index4] == sum && array[index4] != 0){
                                counter ++;
                                array[index4] = 0;
                            }
                        }
                    }

                }
            }
        }
        System.out.println(counter);
    }
}
