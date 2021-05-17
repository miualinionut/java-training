package code._4_student_effort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentPairOf2 implements Command {
    private int computePairs(String[] data, int maxLimit) {
        int[] array = new int[maxLimit];
        int pairs = 0;
        for (String strVal : data) {
            int number = Integer.parseInt(strVal);
            int key = Math.abs(number);
            if (number > 0 && array[key] < 0)
                pairs++;
            if (number < 0 && array[key] > 0)
                pairs++;
            array[key] += number;
        }
        return pairs;
    }

    public void exec(int maxLimit) {
        int pairs = -1;
        try {
            String currDir = System.getProperty("user.dir") + "/_1_basics/src/main/java/code/_4_student_effort/StudentPairOf2.txt";
            File myObj = new File(currDir);
            Scanner myReader = new Scanner(myObj);
            String[] data = myReader.nextLine().split(" ");
            pairs = computePairs(data, maxLimit);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }
        System.out.println(pairs);
    }
}
