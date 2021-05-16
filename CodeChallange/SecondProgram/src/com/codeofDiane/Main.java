package com.codeofDiane;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        System.out.println(compute(15));
    }

    public static String compute(int number) {
        ArrayList<String> lista = new ArrayList<>();
        int index;
        if(number % 3 == 0){
            lista.add("Foo");
        }
        if (number % 5 == 0){
            lista.add("Bar");
        }
        if(number % 7 == 0){
            lista.add("Qix");
        }


        while (number != 0) {
            index = number % 10;
            number = number / 10;

            if (index == 3)
                lista.add("Foo");
            if (index == 5)
                lista.add("Bar");
            if (index == 7)
                lista.add("Qix");

        }
        System.out.println(lista);
        return " ";
    }

    }

