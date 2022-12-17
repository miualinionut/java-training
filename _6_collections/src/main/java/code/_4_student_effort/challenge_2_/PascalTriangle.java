package code._4_student_effort.challenge_2_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        int triangleSize;
        Scanner scanner = new Scanner(System.in);

        triangleSize = scanner.nextInt(); 

        List<List<Integer>> pascalTriangle = createEmtpyTriangle(triangleSize);

        fillTriangle(pascalTriangle, triangleSize);
        displayTriangle(pascalTriangle, triangleSize);
    }

    private static List<List<Integer>> createEmtpyTriangle(int triangleSize) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> line = new ArrayList<>();

        line.add(1);
        triangle.add(line);

        for(int i = 2; i <= triangleSize; i++) {
            line = new ArrayList<>();
            line.add(1);

            for(int j = 1; j < i - 1; j++) {
                line.add(0);
            }

            line.add(1);
            triangle.add(line);
        }

        return triangle;
    }

    private static void displayTriangle(List<List<Integer>> triangle, int triangleSize) {
        int spacingAmount = (triangleSize - 1 / 2) + 1;

        for(int i = 0; i < triangleSize; i++) {
            for(int j = 1; j <=spacingAmount; j++) {
                System.out.print(" ");
            }

            spacingAmount--;

            for(int j = 0; j <= i; j++) {
                System.out.print(triangle.get(i).get(j) + " ");
            }

            System.out.println();
        }
    }

    private static void fillTriangle(List<List<Integer>> triangle, int triangleSize) {
        for(int i = 2; i < triangleSize; i++) {
            for(int j = 1; j < i; j++) {
                int a = triangle.get(i - 1).get(j - 1);
                int b = triangle.get(i - 1).get(j);

                triangle.get(i).set(j, a + b);
            }
        }
    }
}
