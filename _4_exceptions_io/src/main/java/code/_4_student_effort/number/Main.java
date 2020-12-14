package code._4_student_effort.number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public Main() throws IOException {
        while(true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input = reader.readLine();
            if(input.equals("exit"))
                break;

            int num = Integer.parseInt(input);

            int[][] array = getString(num);

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (array[i][j] == 0)
                        System.out.print(' ');
                    if (array[i][j] == 1)
                        System.out.print('|');
                    if (array[i][j] == 2)
                        System.out.print('_');
                }
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        try {
            new Main();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int[][] getString(int num) {

        int[][] one   = {{0,0,0},{0,0,1},{0,0,1}};
        int[][] two   = {{0,2,0},{0,2,1},{1,2,0}};
        int[][] three = {{0,2,0},{0,2,1},{0,2,1}};
        int[][] four  = {{0,0,0},{1,2,1},{0,0,1}};
        int[][] five  = {{0,2,0},{1,2,0},{0,2,1}};
        int[][] six   = {{0,2,0},{1,2,0},{1,2,1}};
        int[][] seven = {{0,2,0},{0,0,1},{0,0,1}};
        int[][] eight = {{0,2,0},{1,2,1},{1,2,1}};
        int[][] nine  = {{0,2,0},{1,2,1},{0,2,1}};
        int[][] zero  = {{0,2,0},{1,0,1},{1,2,1}};

        switch (num) {
            case 1:
                return one;
            case 2:
                return two;
            case 3:
                return three;
            case 4:
                return four;
            case 5:
                return five;
            case 6:
                return six;
            case 7:
                return seven;
            case 8:
                return eight;
            case 9:
                return nine;
            case 0:
                return zero;
        }

        return one;
    }
}
