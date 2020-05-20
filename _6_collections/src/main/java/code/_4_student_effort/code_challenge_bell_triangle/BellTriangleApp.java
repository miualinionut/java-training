package code._4_student_effort.code_challenge_bell_triangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BellTriangleApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        System.out.println("How deep do you want the triangle to go:");
        int depth = -1;

        while (depth < 0) {
            try {
                System.out.print("depth = ");
                depth = Integer.parseInt(scanner.next());
                if (depth < 0)
                    System.out.println("Please enter a positive number");
            } catch (Exception e) {
                System.out.println("Please enter a number.");
            }
        }

        // Generate triangle of having the depth's size
        bellTriangle(depth);

    }

    private static List<Integer> bellTriangle(int depth) {
        if (depth == 1) {
            List<Integer> firstLine = new ArrayList<>();
            firstLine.add(1);
            System.out.println(1);
            return firstLine;
        }

        List<Integer> currentLine = new ArrayList<>();
        // Construct the line somehow
        List<Integer> lastLine = bellTriangle(--depth);

        // The current line starts with the last line's last element
        currentLine.add(lastLine.get(lastLine.size() - 1));

        // Calculate line elements
        for (int i = 0; i < lastLine.size(); i++) {
            currentLine.add(
                    currentLine.get(i) + lastLine.get(i)
            );
        }

        // Print the line
        currentLine.forEach(element -> System.out.print(element + " "));
        System.out.println();
        return currentLine;
    }
}
